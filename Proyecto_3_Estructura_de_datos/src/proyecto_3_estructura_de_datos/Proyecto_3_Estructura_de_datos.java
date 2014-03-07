/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_3_estructura_de_datos;


/**
 *
 * @author Michael Lama y Denisse Suazo
 */
import java.util.Scanner;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;
import java.awt.Dimension;
import java.lang.Double;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import javax.swing.JFrame;
public class Proyecto_3_Estructura_de_datos {

    /**
     * @param args the command line arguments
     */
    
    
      public static  ArrayList<Integer>verti;
        
    public static void main(String[] args) {
      verti=new ArrayList();
      
      DirectedSparseMultigraph<String, avion> g=new DirectedSparseMultigraph<String, avion>();
         
      g.addEdge(new avion("American",706.30), "TGU", "MIA");
      g.addEdge(new avion("Taca",706.30), "TGU", "CUN");
      g.addEdge(new avion("Delta",557.81), "ATL", "JFK");
      g.addEdge(new avion("American",877.10), "TGU", "BWI");
      g.addEdge(new avion("Avianca/Taca",183.70), "TGU", "SAP");
      g.addEdge(new avion("Avianca/Taca",497.03), "SAL", "TGU");  
      g.addEdge(new avion("Avianca/Taca",706.30), "SAP", "RTB");
      g.addEdge(new avion("Avianca/Taca",198.20), "RTB", "TGU");
      g.addEdge(new avion("Avianca/Taca",529.76), "SAP", "MGA");
      g.addEdge(new avion("American",589.10), "MIA", "MEX");
      g.addEdge(new avion("Avianca/Taca",646.65), "MEX", "SAL");
      g.addEdge(new avion("American",586.90), "MIA", "TGU");
      g.addEdge(new avion("Avianca/Taca",417.93), "SAP", "SAL");
      g.addEdge(new avion("Avianca/Taca",431.73), "MGA", "SAL");
      g.addEdge(new avion("Avianca/Taca",441.93), "SAL", "MGA");
      g.addEdge(new avion("Avianca/Taca",520.33), "SAL", "PTY");
      g.addEdge(new avion("American",548.66), "PTY", "MIA");
      g.addEdge(new avion("Avianca/Taca",586.90), "PTY", "BOG");
      g.addEdge(new avion("Avianca/Taca",638.13), "BOG", "LIM");
      g.addEdge(new avion("Avianca/Taca",554.96), "PHL", "ATL");
      g.addEdge(new avion("Avianca/Taca",641.81), "TGU", "ATL");
      g.addEdge(new avion("Avianca/Taca",1738.36), "LIM", "TGU"); 
      g.addEdge(new avion("Avianca/Taca",194.88), "TGU", "RTB");
      g.addEdge(new avion("Avianca/Taca",897.20), "TGU", "CUN");
      g.addEdge(new avion("United",859.00), "CUN", "SAP");
      g.addEdge(new avion("American",534.25), "MIA", "PHL");
      g.addEdge(new avion("Copa",427.49), "SAP", "MEX");
      g.addEdge(new avion("Copa",651.80), "SAP", "PTY");
      g.addEdge(new avion("Copa",1133.40), "TGU", "LAX");
      g.addEdge(new avion("Copa",1123.40), "LAX", "SAP");
      g.addEdge(new avion("American",438.55), "SEA", "DFW");
      g.addEdge(new avion("American",381.00), "MIA", "JFK");
      g.addEdge(new avion("American",2912.00), "JFK", "MAD");
      g.addEdge(new avion("American",488.00), "MEX", "BWI");
      g.addEdge(new avion("American",266.00), "BWI", "LAX");
      g.addEdge(new avion("American",406.00), "LAX", "HNL");
      g.addEdge(new avion("American",425.00), "MIA", "SEA");
      g.addEdge(new avion("American",2907.00), "MIA", "BER");
      g.addEdge(new avion("Delta",2006.00), "JFK", "HND");
      g.addEdge(new avion("American",453.45), "NAP", "AMS");
      g.addEdge(new avion("American",3074.80), "AMS", "JFK");
      g.addEdge(new avion("American",528.36), "DFW", "MIA");
      g.addEdge(new avion("American",3754.47), "MIA", "AMS");
      g.addEdge(new avion("Spirit",190.32), "SPS", "MIA");
      g.addEdge(new avion("Spirit",405.82), "SAL", "JFK");
      g.addEdge(new avion("easyJet",383.13), "MAD", "NAP");
      g.addEdge(new avion("United",304.00), "HNL", "HND");
      g.addEdge(new avion("United",307.00), "HND", "HNL");
      g.addEdge(new avion("American",788.00), "HND", "LAX");
      g.addEdge(new avion("American",408.00), "HNL", "LAX");
      g.addEdge(new avion("easyJet",3074.80), "BER", "MAD");
      
      //Dibuja el grafo
     
      Layout l = new FRLayout( g );
      BasicVisualizationServer<String,avion> vv = 
      new BasicVisualizationServer<String,avion>(l);
      vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
      vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
      vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR); 
      JFrame jf = new JFrame();
      vv.setPreferredSize(new Dimension(350,350));
      JFrame frame = new JFrame("Directed Graph View");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(vv); 
      frame.pack();
      frame.setVisible(true);  
      
      ArrayList<String>ar=new ArrayList(); 
      Collection<avion> edges = g.getEdges();
      Object[] edge = edges.toArray();//introduce los precios en edge
      Collection<String> vertices = g.getVertices();
      Object[] vertex = vertices.toArray();//los vertices del grafo
      
      double matrix[][]=new double[vertex.length][vertex.length];
      ArrayList<String> ar2=new ArrayList();
      for(int i=0;i<vertex.length;i++){
        ar2.add((String)vertex[i]);
      }
      //inicializa con 5000 los precios
      for(int i=0;i<matrix.length;i++){
        for(int i2=0;i2<matrix.length;i2++){
             matrix[i][i2]=5000;
        }//fin del segundo for
      }//fin del primer 
      //introduce los precios de las ciudades
      for(int i=0;i<edges.size();i++){
          Pair<String> endpoints = g.getEndpoints(((avion)(edge[i])));
          matrix[ar2.indexOf(endpoints.getFirst())][ar2.indexOf(endpoints.getSecond())]=((avion)(edge[i])).precio;
      }//fin del for
      System.out.println("");
      
     //floyd y sacar caminos
     double[][] ma = new double[matrix.length][matrix.length];
     for(int k=0;k<matrix.length;k++){
        for(int i=0;i<matrix.length;i++){
            ma[k][i]= matrix[k][i]; 
        } 
     }
      double[][] mati = new double[matrix.length][matrix.length];
     for(int k=0;k<matrix.length;k++){
        for(int i=0;i<matrix.length;i++){
            mati[k][i]= matrix[k][i]; 
        } 
     }
           
     //Floyd para matrix, que es la matriz de precios  hbhybhyswd
     for(int k=0;k<matrix.length;k++){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][k]+matrix[k][j]<matrix[i][j]){
                    matrix[i][j]=matrix[i][k]+matrix[k][j];                   
                }//fin del if
            }//fin del for
        }
     } 
     //Utilizar la matriz p, para encontrar camino mas corto, si no hay camino lo inicializa en -1, en otro caso lo pone en -2
     int [][] p=new int[matrix.length][matrix.length];
     for(int i=0;i<matrix.length;i++){
        for(int i2=0;i2<matrix.length;i2++){
            if(matrix[i][i2]==5000|| i==i2){
                p[i][i2]=-1; 
            }else{
                p[i][i2]=-2;
            }
        }
     }
     //floy para ma, y tambien los caminos para p
     for(int k=0;k<matrix.length;k++){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(ma[i][k]+ma[k][j]<ma[i][j]){
                    ma[i][j] = ma[i][k]+ma[k][j]; 
                    p[i][j]=k;
               }//fin del if
            }//fin del for
       }//fin del for
     }
     
     
     System.out.println("");
     System.out.println("");
     System.out.println("Lista de cuidades");
      for(int i=0;i<vertex.length;i++){
         System.out.println(vertex[i]);
      }//fin del for
    
      char d='o';
      Scanner s=new Scanner(System.in);
      String temp="";
      while(d!='s'){
        System.out.println("Ingrese la cuidad");
       
        temp=s.next().toUpperCase();
         if(ar.contains(temp)){
             System.out.println("La cuidad ya habia sido agregada anteriormente y no se agregara");
        }
         else{
             ar.add(temp);
         }
        System.out.println("Salir s/n");
        d=s.next().toLowerCase().charAt(0);
      }
     int f[]= new int[ar.size()-1];
     for(int i=0;i<f.length;i++){
        f[i]=ar2.indexOf(ar.get(i+1));
     }
     
     
     
     
     
     int h=fact(f.length);
      
     ArrayList<int[]>list;
     list=new ArrayList();
   //  list.add(f);
     int[] y=new int[f.length];
      boolean k=true;
      int[][] mat=new int[h][f.length];
      
      for(int i=0;i<h;i++){
          for(int i2=0;i2<f.length;i2++){
           mat[i][i2]=0;
          }//fin del segundo for
      }//fin del for
      int fila=0;
      int cont=0;
      ArrayList<Boolean>bool;
      bool=new ArrayList();
      for(int i=0;i<h;i++){
            y=shuffle(f);
            if(i==0){
           for(int i2=0;i2<f.length;i2++){
               mat[0][i2]=y[i2];
           }//fin del for
            }//fin del if
            for(int i2=0;i2<h;i2++){
                for(int i3=0;i3<f.length;i3++){
                    if(mat[i2][i3]==y[i3]){
                       cont++;///errror
                    }//fin del if
                    
                }//fin del segundo for
                if(cont==f.length-1){
                        bool.add(true);
                    }//fin del if
                    else{
                        bool.add(false);
                    }//fin del else
                    cont=0;
            }//fin del primer for
            
           for(int i2=0;i2<f.length;i2++){
               mat[fila][i2]=y[i2];
           }//fin del for
           fila++;
           if(fila==h){
               break;
           }
            while(bool.contains(true)&&fila+1<h){
                y=shuffle(f);
                System.out.println("valores de y en el while");
                for(int i2=0;i2<y.length;i2++){
                    System.out.println(y[i2]);
                }
                bool.clear();
          
            for(int i2=0;i2<h;i2++){
                for(int i3=0;i3<f.length;i3++){
                    if(mat[i2][i3]==y[i3]){
                       cont++;
                    }//fin del if
                    
                }//fin del segundo for
                
                System.out.println("valor de cont en  while "+cont);
                if(cont==f.length-1){
                        bool.add(true);
                    }//fin del if
                    else{
                        bool.add(false);
                    }//fin del else
                    cont=0;
            }//fin del primer for
            if(bool.contains(true)==false){
             for(int i2=0;i2<f.length;i2++){
               mat[fila][i2]=y[i2];
               
             }
             fila++;
           }
       }
       }//fin del for principal
     
      double min = 10000;
      int ele =-1;
     double costos[][]=new double[26][26]; 
     for(int q=0;q<costos.length;q++){
     for(int w=0;w<costos.length;w++){
      costos[q][w]=-2.0;   
     }
     }
     for(int i=0;i<h;i++){
     verti.add(0,ar2.indexOf(ar.get(0)));
     
     for(int r=0;r<f.length;r++){///////////////////////////////////////////////////////////////////////////////////
       camino2(verti.get(r),mat[i][r],p); 
       verti.add(mat[i][r]);
     }
      if(mat.length>0){
      verti.add(mat[i][mat.length-1]);
          
      }
      double costo=0;
      for(int j=0;j<verti.size()-2;j++){
        costo+= matrix[(int)verti.get(j)][(int)verti.get(j+1)];
        if(costo==5000){
          costo+=100000;
        }
      }
     
     for(int t=0;t<verti.size()-1;t++){
     costos[i][t] = verti.get(t);
     }
     costos[i][verti.size()] = costo;
     if(costo<min){
     min = costo;
     ele=i;
     }
     verti.clear();
     }
     double cost =0;
     int ultima =-1;
     for(int i=0;i<costos.length;i++){
          if(costos[ele][i]!=-2.0){
         if(costos[ele][i]<=25.0){
          System.out.print(ar2.get((int)costos[ele][i])+"->");
            ultima =(int) costos[ele][i];
         }else{
              
             cost = costos[ele][i];
         }
         }
     }
     
      verti.add(ultima);
     camino(ultima,ar2.indexOf(ar.get(0)),p);
     verti.add(ar2.indexOf(ar.get(0)));
       
     for(int j=0;j<verti.size()-1;j++){
       cost+= matrix[(int)verti.get(j)][(int)verti.get(j+1)];
    }
     for(int j=1;j<verti.size();j++){
         System.out.print(ar2.get(verti.get(j))+"->");
     }
     
        System.out.println(" "+cost);
     
     
    }//fin del main
    
    public static void camino(int i,int j, int[][] p){
        int k= p[i][j];
        if(k==-2 || k==-1){
        }else{  
         camino(i, k, p);
         verti.add(k);
        }
    }
    
    public static void camino2(int i,int j, int[][] p){
        int k= p[i][j];
        if(k==-2 || k==-1){
        }else{  
         verti.add(k);
         camino(i, k, p);
        }
    }
    static int[] shuffle(int[] a)
  {
  
   int n = a.length;
    for (int i = 0; i < n; i++)
    {
        // between i and n-1
        int r = i + (int) (Math.random() * (n-i));
         int r2 = i + (int) (Math.random() * (n-i));
        int tmp = a[r2];    // swap
        a[r2] = a[r];
        a[r] = tmp;
    }
    return a;
  }
    
    
    
    
    public static int fact(int n)
    {
        int result;
       if(n==0)
        return 1;   
       
       if(n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }//fin del metodo

}//fin de la clase
