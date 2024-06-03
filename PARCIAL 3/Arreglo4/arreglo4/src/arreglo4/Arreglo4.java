public class Arreglo4 {

    public static void main(String[] args) {
        
        int numProductos = 10;

        int[] pro = new int [numProductos],
              pro1 = new int [numProductos],
                pro2 = new int [numProductos];
        
        for (int i = 0; i < numProductos; i++) {
            proo(pro, pro1,pro2, i);            
            System.out.println("Intentario = " + pro[i] + " Venta= " + pro1[i] + " Compra= " + pro2[i]);
        }

    }
    
    
    public static void proo(int pro[], int pro1[], int pro2[], int i){
        
        pro[i] = randomInvent();
            pro1[i] = randomInvent();
            
            if (pro1[i] > pro[i]) {
                pro2[i] = 2 * (pro1[i] - pro[i]);
            }else{
                pro2[i] = pro1[i];
            }
        
    }
    
    
    
    public static int randomInvent(){
        return (int)(Math.random() * 501);
    }
    
}


