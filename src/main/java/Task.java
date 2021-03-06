/*************************************************************
 *
 *         Public class by factionsypho
 *
 * *************************************************************/

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public String toString(){
        return "[" + getStatusIcon() + "]" + this.description;
    }

    public String setDone(){
        this.isDone = true;
        return "Nice! I've marked this task as done: \n\t [\u2713] " + this.description;
    }

}