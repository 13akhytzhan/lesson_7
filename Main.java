import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*[Problem 1]

Екі таңбалы сан берілген. Табу қажет:
а) құрамына 3 саны кіреді ме;
б) құрамына a саны кіреді ме;
*/
        /*int n = sc.nextInt();
        int a = n/10;
        int b = n%10;
        int x = sc.nextInt();
        if (a == 3 || b ==  3) System.out.println("3 bar");
        else System.out.println("3 jok");
        if (a == x || b ==  x) System.out.println(x + " bar");
        else System.out.println(x + " jok");*/
        /*[Problem 7]

n саны берілген. Оның төрт санын ескере отырып, палиндром (“перевертыш”) екенын анықтау,
мысалы, 7777, 8338, 0331 және т.б. сандары секілді (Палиндром деп ондық белгісі солдан оңға
және оңнан солға бірдей оқылатын санды айтады).*/
         /*int n = sc.nextInt();
         if (n%10 == n/1000 && n/100%10 == n/10%10) System.out.println("palindrom");
         else System.out.println("ne palindrom");*/
        /*[Problem 8]

n саны берілген. Сан құрамында, төрт таңбалы сан екенін ескере отырып, үш бірдей сан бар екенін анықтау. Мысалы, 3363, 4844, 1300 және т.б.
*/
        /*int n = sc.nextInt();
        int cnt1 = 1;
        int cnt2 = 1;
        if (n/1000 == n/100%10) {
            cnt1++; cnt2++;
        }
        if (n/1000 == n/10%10) cnt1++;
        if (n/100%10 == n/10%10) cnt2++;
        if (n/1000 == n%10) cnt1++;
        if (n/100%10 == n%10) cnt2++;
        if (cnt1 >= 3 || cnt2>= 3) System.out.println("YES");
        else System.out.println("NO");*/
        /*[Problem 9]

n саны берілген. Төрт таңбалы сан екенін ескере отырып, оның құрамындағы сандар әртүрлі екенін
анықтау. Мысалы, 3678 санында барлығы әртүрлі, ал 1013 санында - жоқ.*/
        /*int n = sc.nextInt();
        int n1 = n/1000;
        int n2 = n/100%10;
        int n3 = n/10%10;
        int n4 = n%10;
        if (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3==n4) System.out.println("NO");
        else System.out.println("YES");*/
        /*[Problem 10]

Алты таңбалы сан “бақытты сан” екенін анықтау. (Бақытты сан деп бастапқы үш санының қосындысы
соңғы үш санының қосындысына тең алты таңбалы санды айтады.)
*/
        /*int n = sc.nextInt();
        if (n/100000+n/10000%10+n/1000%10 == n/100%10+n/10%10+n%10) System.out.println("bakytty");
        else System.out.println("bakytsyz");*/
        /*[Problem 11]
Боксер салмағы берілген. Боксер осы үш салмақ категориясының біреуіне кіретіні белгілі:
1) жеңіл салмақ — 60 кг дейін;
2) бірінші жартылай-орта салмақ — 64 кг дейін;
3) жартылай-орта салмақ — 69 кг дейін;
Боксер кай категорияда өнер көрсететінін анықтау.*/
        /*int n = sc.nextInt();
        if (n <= 60) System.out.println("zhenil");
        else if (n <= 64) System.out.println("1 zhartylai orta");
        else System.out.println("zhartylai orta");*/
        /*[Problem 12]

Апта күнінің реттік номері бойынша (1, 2, …,7) оның атын (Дүйсенбі, Сейсенбі, …, Жексенбі) шығаратын программаны құрастыру.

[Problem 13]

Ай күнінің реттік номері бойынша (1, 2, …,12) оның атын (Қаңтар, Ақпан, …, Желтоқсан) шығаратын программаны құрастыру.

[Problem 14]

Ай күнінің реттік номері бойынша (1, 2, …,12) оның қай жыл мезгіліне жататынын анықтайтын программаны құрастыру.
*/
        int w = sc.nextInt();
        int m = sc.nextInt();
        if (w==1) System.out.println("Monday");
        if (w==7) System.out.println("Sunday");
        if (w==2) System.out.println("Tuesday");
        if (w==3) System.out.println("Wednesday");
        if (w==4) System.out.println("Thursday");
        if (w==5) System.out.println("Friday");
        if (w==6) System.out.println("Saturday");
        if (m==1) System.out.println("January - Winter");
        if (m==2) System.out.println("February - Winter");
        if (m==3) System.out.println("March - Spring");
        if (m==4) System.out.println("April - Spring");
        if (m==5) System.out.println("May - Spring");
        if (m==6) System.out.println("June - Summer");
        if (m==7) System.out.println("July - Summer");
        if (m==8) System.out.println("August - Summer");
        if (m==9) System.out.println("September - Autumn");
        if (m==10) System.out.println("October - Autumn");
        if (m==11) System.out.println("November - Autumn");
        if (m==12) System.out.println("December - Winter");
    }
}