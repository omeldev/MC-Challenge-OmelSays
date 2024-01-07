package dev.omel.says.task;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class ChallengeTask {

    @Getter
    private int timeInSeconds;
    @Setter
    @Getter
    protected BiConsumer<Boolean, Player> consumer;

    public ChallengeTask(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

}
