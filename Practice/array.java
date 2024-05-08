package Practice;

public class array {
    

    public static void main(String[] args) {
        
        // int[] marks =new int[5]; //delceare+define size
        
        // marks[0]= 100;
        // marks[1]= 10;
        // marks[2]= 102;
        // marks[3]= 106;

        // int[] marks = {1,3,45,44,3}; //decleare+intilize
        

        // System.out.println(marks.length);

//         System.out.println("marks in straight order");
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }

//         System.out.println("Marks in reverse order");

//        for(int i = marks.length - 1; i >= 0; i--) {
//     System.out.println(marks[i]);
// }



//      for(int element:marks){
//     System.out.println(element);
// }



//   practice

// float[] marks ={23f,34f,43f,45f,33f};

// float sum=0;

// for(float element:marks){
//     sum+=element;
// }

// System.out.println(sum);


// int[] num = {1,2,3,4,5,6,7,8,9,10};
// int target =5;

// for(int element:num){
//     if(element==target){
//         System.out.println("The array has the number"+"\n"+ element);
//        break;
//     }

// }






// Problem 3





// int[] marks = {69,58,38,78,34};
// int sum=0;
// double average;

// for(int i=0;i<marks.length;i++){

//     sum = sum+marks[i];
//     System.out.println(sum);

// }
// average =(double) sum /marks.length;

//  System.out.println(average);






// Adding a matrix



// int[][] martix1 ={{2,3,5},
//                   {3,5,3}};
// int[][] martix2 ={{4,5,6},
//                   {2,5,4}};
// int[][] result = {{0,0,0},
//                   {0,0,0}};

//     for(int i=0;i<martix1.length;i++){
//         for(int j=0;j<martix1[i].length;j++){
//             System.out.format("Setting value for i=%d and j=%d\n", i,j);
//             result[i][j]=martix1[i][j]+martix2[i][j];
//         }
//     }

//     for(int i=0;i<martix1.length;i++){
//         for(int j=0;j<martix1[i].length;j++){
//             System.out.print((result[i][j]+" "));
//             result[i][j]=martix1[i][j]+martix2[i][j];
//         }


//         System.out.println("");
//     }










// Reverse an array



    // int[] array = {1,2,3,4,8,7,9,6};
    // int l =array.length;
    // int temp;
    // int n = Math.floorDiv(l, 2);
    // for(int i=0;i<n;i++){
    //     // Swapping a[i] and a[l=1=i]
    //     temp =array[i];
    //     array[i]=array[l-i-1];
    //     array[l-i-1] =temp;

    // }


    // for(int element:array){
    //     System.out.println(element);
    // }
 


//   problem 5


    //  int[] arr = {2,4,10,11,5,34,43,2,1};
    //  int l=arr.length;
    //  int max=0;

     
    //  for(int ele:arr){
    //     if(ele>max){
    //         max=ele;
    //     }
      
    //  }
    //  System.out.println(max);

  
    //problem 7


       int[] arr = {2,4,10,11,5,34,43,2,1};
     int l=arr.length;
     int min = Integer.MAX_VALUE;

        for(int ele:arr){
        if(ele<min){
            min=ele;
        }
      
     }
     System.out.println(min);







    }


}
 