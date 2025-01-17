package com.sonicboom.ircchat.client.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.*;
import net.minecraft.util.Formatting;

public class ChatUtil {
    public static final MinecraftClient MC = MinecraftClient.getInstance();
    public static void sendClientMessage(String message){
        MC.inGameHud.getChatHud().addMessage(Text.of(message));
    }
    public static String getUsername(){
        return MC.player.getName().getString();
    }
    public static void formatIrcMessage(String user,String message){
        Text text=Text.literal("[")
                .append(Text.literal(user).formatted(Formatting.GREEN))
                .append(Text.literal("]"))
                .append(Text.literal(" > "+message).formatted(Formatting.GREEN));
        MC.inGameHud.getChatHud().addMessage(text);
    }
}
