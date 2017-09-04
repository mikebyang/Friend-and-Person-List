package friends;

// represents a list of people as a linked list of Person objects
public class PersonList {
	Person firstPerson;		// First Person object in the list

	public PersonList( ) {
		this.firstPerson = null;
	}
	
	// finds Person object in this list with given name
	// if none exists, returns null.  Runs in O(number of persons in this list) 
	public Person lookup(String name){
		for(Person per = firstPerson; per != null; per = per.nextPerson)
		{
			if(per.name.compareTo(name) == 0)
			{
				return per;
			}
		}
		return null; // replace this line
	
	}
	
	// creates a new Person object with name and adds it to the list of 
	// Person objects.  Runs in O(1)
	public Person addPerson(String name){
		Person newp;
		if(firstPerson == null)
		{
			firstPerson = new Person(name, firstPerson);
			return firstPerson;
		}
		else
		{
			newp = new Person(name, firstPerson);
			firstPerson = newp;
			return firstPerson;
		}
		
//		return null; // replace this line
		}

}
