public class cycleDifference {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("------");
        for(int j=0;j<5;j++){
            if(j==3){
                continue;
            }
            System.out.println(j);
        }
    }
}
