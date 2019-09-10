package duke.command;

import duke.exception.DukeException;
import duke.task.Task;
import duke.handler.Storage;
import duke.ui.Ui;

import java.io.IOException;
import java.util.ArrayList;

public class DeleteCommand extends Command {

    protected int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(ArrayList<Task> tasks, Ui ui, Storage storage) throws DukeException, IOException {
        Task deletedTask = tasks.remove(index - 1);
//        ui.showDeleteResponse(deletedTask);
//        ui.showTotalNumberTasks(tasks);
        response = "Noted. I've deleted the following task:\n    " + deletedTask + "\nNow you have " + tasks.size()
                + " task(s) in the " + "list.";
    }
}
