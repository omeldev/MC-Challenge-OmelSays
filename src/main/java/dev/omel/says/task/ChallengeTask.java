package dev.omel.says.task;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.function.Consumer;

public abstract class ChallengeTask {

    @Getter
    private int timeInSeconds;
    @Setter
    @Getter
    protected Consumer<Boolean> consumer;

    public ChallengeTask(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }



}
