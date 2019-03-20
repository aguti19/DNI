	import java.util.Scanner;
	
	public class EX1 {

		public static void main(String[] args) {

			int Jonathan=3;
			int numero[] = new int[23];
			int resultat, T = 0, R = 1, W = 2, A = 3, G = 4, M = 5, Y = 6, F = 7, P = 8, D = 9, X = 10, B = 11, N = 12,
					J = 13, Z = 14, S = 15, Q = 16, V = 17, H = 18, L = 19, C = 20, K = 21, E = 22;
			int arraydni[] = new int[7];
			Scanner sc = new Scanner(System.in);
			int num;
			int i = 0;

			numero[0] = T;
			numero[1] = R;
			numero[2] = W;
			numero[3] = A;
			numero[4] = G;
			numero[5] = M;
			numero[6] = Y;
			numero[7] = F;
			numero[8] = P;
			numero[9] = D;
			numero[10] = X;
			numero[11] = B;
			numero[12] = N;
			numero[13] = J;
			numero[14] = Z;
			numero[15] = S;
			numero[16] = Q;
			numero[17] = V;
			numero[18] = H;
			numero[19] = L;
			numero[20] = C;
			numero[21] = K;
			numero[22] = E;

			System.out.println("Introdueix numero DNI: ");
			num = sc.nextInt();

			while (num > 0) {
				if (i > arraydni.length) {
					arraydni[i] = num;

				} else {
					System.out.println("Error. Torna a escriure: ");
				}

				resultat = num / 23;

				System.out.println("Lletra: " + resultat);

			}
		}
	}

