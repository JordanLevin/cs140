package assignment03;

public class Test3{
    public static void main(String[] args){
        Space space1 = new Space("space1", 10.0);
        Space space2 = new Space("space2", 20.0);
        Space space3 = new Space("space3", 30.0);
        House h = new House();
        h.add(space1);
        h.add(space2);
        h.add(space3);


        Space space4 = new Space("space4", 60.0);
        Space space5 = new Space("space5", 20.0);
        Space space6 = new Space("space6", 40.0);
        House h2 = new House();
        h2.add(space4);
        h2.add(space5);
        h2.add(space6);


        House[] test1 = null;
        House[] test2 = {};
        House[] test3 = {null, null, null};
        House[] test4 = {h, null, null};
        House[] test5 = {null, h, h2};

        System.out.println(Test3.biggestFloorSpace(test1));
        System.out.println(Test3.biggestFloorSpace(test2));
        System.out.println(Test3.biggestFloorSpace(test3));
        System.out.println(Test3.biggestFloorSpace(test4));
        System.out.println(Test3.biggestFloorSpace(test5));
    }
    public static House biggestFloorSpace(House[] houses){
        House biggest = new House();
        int counter = 0;
        if(houses!=null){
            for(int i = 0;i<houses.length;i++){
                if(houses[i]!=null){
                    counter++;
                    if(houses[i].totalArea()>biggest.totalArea())
                        biggest = houses[i];
                }
            }
            if(counter>0)
                return biggest;
        }
        return null;

    }
}
