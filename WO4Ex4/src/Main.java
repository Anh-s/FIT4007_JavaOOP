import java.util.Scanner;
public class Main {
    public class ListChuyenXe
    {
        private ChuyenXe[] CX = new ChuyenXe[100];
        private int countCX;
        private double sum1=0, sum2=0;
        public void ListCX()
        {
            countCX=0;
            for(int i=0; i<100; i++)
            {
                CX[i] = new ChuyenXe();
            }
        }
        public void listcx(int temp)
        {
            if(countCX>100)
                System.out.println("Khong the them du lieu!");
            else
            {
                if(temp==1)
                {
                    CX[countCX] = new NoiThanh();
                    NoiThanh noit = new NoiThanh();
                    noit.nhap();
                    CX[countCX]=noit;
                    sum1+=noit.getDoanhThu();
                }
                else
                {
                    CX[countCX] = new NgoaiThanh();
                    NgoaiThanh ngoait = new NgoaiThanh();
                    ngoait.nhap();
                    CX[countCX]=ngoait;
                    sum2+=ngoait.getDoanhThu();
                }
                countCX++;
            }
        }
        public void xuattt()
        {
            for(int i=0 ; i<countCX; i++)
            {
                System.out.println("------------/---------------/------------");
                System.out.println(CX[i].toString());
            }
            System.out.println("----------------Doanh Thu-----------------");
            System.out.println("| Chuyen Xe Noi Thanh: " + sum1 + "|");
            System.out.println("| Chuyen Xe Ngoai Thanh: " + sum2 + "|");
            System.out.println("------------------------------------------");
        }
    }
    public class QLChuyenXe
    {
        public static void main(String[] args)
        {
            int x;
            Scanner a = new Scanner(System.in);
            ListChuyenXe dscx = new ListChuyenXe();
            do
            {
                System.out.println("\n\t-----------------------------------");
                System.out.println("\t0. Exit");
                System.out.println("\t1. Them Chuyen Xe Noi Thanh");
                System.out.println("\t2. Them Chuyen Xe Ngoai Thanh");
                System.out.println("\t3. Hien thi danh muc Chuyen Xe");
                System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                x = a.nextInt();
                System.out.println("------>>");
                switch(x)
                {
                    case 1:
                        dscx.listcx(1);
                        break;
                    case 2:
                        dscx.listcx(2);
                        break;
                    case 3:
                        dscx.xuattt();
                        break;
                }
            } while(x!=0);
            System.out.println("");
        }
    }


}