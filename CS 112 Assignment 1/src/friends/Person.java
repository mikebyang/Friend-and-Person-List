package friends;

public class Person {
	String name;		// the person's name
	Friend firstFriend; // the first friend in the list of this
					    // person's friends
	Person nextPerson;  // the next person in the list of people
	
	public Person(String name, Person nextPerson) {
		this.name = name;
		this.nextPerson = nextPerson;
		}

	// A string representing the list of friends of this person.  
	// O(number of friends in the list)
	public String friendString(){
		String str="";
		for(Friend fri=firstFriend; fri != null; fri=fri.nextFriend){
			if(fri.nextFriend == null){
				str = str + fri.who.name;
				break;
			}
			else{
				str = str + fri.who.name + " ";
			}
		}
		return str; // replace this line
	
	}
	
	// add friend as a friend of this person
	// O(1)
	public void addFriend(Person friend){
		Friend newp = new Friend(friend,firstFriend);
		this.firstFriend = newp;
//		return; // replace this line
	}
	
	// remove Person friend as a friend of this person
	// if friend is not a friend of this person, does nothing
	// O(number of friends of this person)
	public void removeFriend(Person friend){
		Friend prev = null;
		for(Friend cur = this.firstFriend; cur != null; cur=cur.nextFriend)
		{
			if(cur.who.name.compareTo(friend.name) == 0)
			{
				if(prev == null)
				{
					this.firstFriend=cur.nextFriend;
					break;
				}
				else
				{
					prev.nextFriend = cur.nextFriend;
					break;
				}
			}
			prev = cur;
		}
//		return; // replace this line
	
		
	}
}
