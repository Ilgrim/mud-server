package mud.quest;

/**
 * Task Types
 * 
 * NONE     - No Specific Type
 * DELIVER  - deliver a specific object to a place or person
 * RETRIEVE - Obtain a specific object from somewhere else
 * COLLECT  - Collect a certain number of the specified object and return them to the quest giver
 * KILL     - Kill something/someone (number of creatures, an individual, ?)
 * 
 * @author Jeremy
 *
 */
public enum TaskType {
	NONE, DELIVER, RETRIEVE, COLLECT, KILL
}