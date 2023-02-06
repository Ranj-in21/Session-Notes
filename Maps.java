Maps

Storing the data in 2D (Key,value pair)
Interface (not extending Collection) - separate Interface
List & Set extends Collection
Implementation classes 
HashMap - faster (random)
TreeMap - Key ASCII order
LinkedHashMap - Order of insertion

EntrySet - Key & Value pair
Key - No duplicates allowed (set)
Value - Duplicates are allowed
Map<Integer, String> mentors = new HashMap<Integer, String>();

To add an item to Map
mentors.put();
mentors.put(1001, Ranjini);
mentors.put(1001, Subraja);
{1001=Aravind, 1002=Subraja}

mentors.entrySet();         //to get the values - key, value
Set<Entry<Integer, String>> entrySet = mentors.entrySet();
for(Entry<Integer, String> entry: entrySet) {
    syso(entry.getKey();
    syso(entry.getValue);
    
}