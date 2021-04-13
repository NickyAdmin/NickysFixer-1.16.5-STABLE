package me.nickyadmin.nickysfixer.utils;

import net.minecraft.server.v1_16_R3.MinecraftServer;

public class GetTps_1_12_R1 {
        @SuppressWarnings("deprecation")
        public static double getTps () {
            try {
                try {
                    return (MinecraftServer.getServer().recentTps[0]);
                } catch (NoClassDefFoundError e) {}
            } catch (StackOverflowError e) {}
            return getTps();
        }


}

