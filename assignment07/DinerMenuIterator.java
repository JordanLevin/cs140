package assignment07;

public class DinerMenuIterator implements MenuEntryIterator{
    private MenuEntry[] list;
    private int pos;

    public DinerMenuIterator(MenuEntry[] l){
        list = l;
        pos = 0;
    }
    public MenuEntry next(){
        return list[pos++];
    }
    public boolean hasNext(){
        if(list==null  || pos>=list.length || list[pos]==null)
            return false;
        return true;
    }
	public void remove() {
        if (pos <= 0) {
            throw new IllegalStateException
            ("You can't remove an Entry until you've done at least one next()");
        }
        if (list[pos-1] != null) {
            for (int i = pos-1; i < (list.length-1); i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
	}
}
