package dev.omel.says.command;

import dev.omel.says.task.handler.TaskHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GetTask implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command command, String label, String[] args) {

        cs.sendMessage("next task");

        TaskHandler.getInstance().nextTask();

        return false;
    }

}
