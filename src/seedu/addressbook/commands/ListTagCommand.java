package seedu.addressbook.commands;

import java.util.Iterator;

import seedu.addressbook.data.tag.Tag;

/* 
 * Lists all tags in the address book to the user.
 */

public class ListTagCommand extends Command {

	public static final String COMMAND_WORD = "listtag";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" 
            + "Displays all tags in the address book as a list with index numbers.\n\t"
            + "Example: " + COMMAND_WORD;

	@Override
	public CommandResult execute() {
		Iterator<Tag> tagIterator = addressBook.getAllTags().iterator();
		StringBuilder result = new StringBuilder();
		int counter = 1;
		while(tagIterator.hasNext()) {
			result.append(counter).append(". ").append(tagIterator.next()).append("\n");
			counter++;
		}

        return new CommandResult(result.toString());
	}

}
