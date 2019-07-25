import java.util.*;

public class practiceTest{
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        System.out.println("Enter the number of list : ");
        int ele = scan.nextInt();
        while(i<ele){
            List<Integer> list = new ArrayList<>();
            System.out.println("Enter the amount of list you want to have in the arraylist number " + ++i + ": ");
            i--;
            int n = scan.nextInt();
            System.out.println("Enter the number(s) in your list: ");
            for(int j=0; j<n;j++){
                list.add(scan.nextInt());
            }
            lists.add(list);
            i++;
        }
        System.out.println("Enter the number of list you want to get output :");
        int n = scan.nextInt();
        for(i = 0; i<n ; i++){
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            scan.nextLine();
            if(x<lists.size() && y<lists.get(x).size()){
                System.out.println(lists.get(x).get(y));
            }else{
                System.out.println("Error!");
            }
        }
        
    }
}