package hrjava.advanced;

public class VarargsSimpleAddition {

    public void add (int... args){
        int total = 0;
        for(int i = 0; i<args.length; i++){
            System.out.print(args[i]);
            if(i!=args.length-1){
                System.out.print("+");
            }
            total += args[i];
        }
        System.out.println("=" + total);
    }

}
