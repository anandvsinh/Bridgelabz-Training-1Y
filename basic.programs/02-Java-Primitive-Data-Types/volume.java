public class volume {
    public static void main(String[] args) {
        
        int rkm = 6378;
        float rmile = 6378*1.6f;
        double volk = (4/3)*Math.PI*Math.pow(rkm, 3);
        double volm = (4/3)*Math.PI*Math.pow(rmile, 3);

        System.out.printf("The volume of earth in cubic kilometers is "+volk+" and cubic miles is "+volm);
    }
}
