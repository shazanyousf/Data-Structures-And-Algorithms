// We are given a bar of chocolate composed of mxn square pieces. One should break the chocolate
//into single squares. Each break of a part of the chocolate is charged a cost expressed by a positive
//integer. This cost does not depend on the size of the part that is being broken but only depends on
//the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines
//with x1, x2, .. xm-1 and along horizontal lines with y1, y2., ... n-1.
//Compute the minimal cost of breaking the whole chocolate into single squares.
import java.util.*;
public class ChocolaProblem{
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVertical[] = {2, 1, 3, 1, 4};
        Integer costHorizontal[] = {4, 1, 2};
        Arrays.sort(costVertical, Collections.reverseOrder());
        Arrays.sort(costHorizontal, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while(h < costHorizontal.length && v < costVertical.length){
            //Vertical cost < Horizontal cost
            if(costVertical[v] <= costHorizontal[h]){
                cost += (costHorizontal[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVertical[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHorizontal.length){
            cost += (costHorizontal[h] * vp);
            hp++;
            h++;
        }
        while(v < costVertical.length){
            cost += (costVertical[v] * hp);
                vp++;
                v++;
        }
        System.out.println("Minimum cost of cuts = " + cost);
    }
}