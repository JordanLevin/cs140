package lab06;

public class Partitioner {
	private Parent[] parents;
	private Child[] children;
	
	public Parent[] getParents() {
		return parents;
	}
	public Child[] getChildren() {
		return children;
	}
	public void partition(Parent[] array){

		int c = 0;
		int p = 0;
		for(int i =0;i<array.length;i++){
			if(array[i].isChild()){
				//children[c] = (Child) array[i];
				c++;
			}
			if(!array[i].isChild()){
				//parents[p] = array[i];
				p++;
			}
				
		}
		parents = new Parent[p];
		children = new Child[c];
		c = 0;
		p = 0;
		for(int i =0;i<array.length;i++){
			if(array[i].isChild()){
				children[c] = (Child) array[i];
				c++;
			}
			if(!array[i].isChild()){
				parents[p] = array[i];
				p++;
			}
				
		}
	}
}
