import com.zubiri.matriculas.*;
import java.io.IOException;
import java.util.Scanner;
/*import java.util.InputMismatchException;
import java.io.FileNotFoundException;*/

public class MainRuben {

	public static void main(String[] args) throws Exception {
		int seleccion=-1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Añadir Alumno -------------------------------- 1");
			System.out.println("Mostrar Alumnos ------------------------------ 2");
			System.out.println("SALIR DEL PROGRAMA --------------------------- 3");
			
			seleccion = sc.nextInt();
			switch (seleccion) {
				case 1:
					Alumno alumno = new Alumno(sc);
					break;
				case 2:
					System.out.println("Mostrar Alumnos");
					System.out.println(Alumnos.formatted());
					break;
				case 3:
					System.out.println("Has decidido salir");
					break;
			}
		} while (seleccion != 3);
	}
}