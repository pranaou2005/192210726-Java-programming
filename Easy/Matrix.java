import java.util.*;
class Matrix{
	public static void main(String args[]){
		int a[][]={{1,1,1},{1,1,1},{1,1,1}};
		int b[][]={{1,1,1},{1,1,1},{1,1,1}};
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		int i,k,j,n=3;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multiplication:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				d[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Addition:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}
}
