package thuc_hanh.bai_2;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BenhNhan benhNhan01 = new BenhNhan("peter", true);
        BenhNhan benhNhan02 = new BenhNhan("james", false);
        BenhNhan benhNhan03 = new BenhNhan("linda", true);
        BenhNhan benhNhan04 = new BenhNhan("jack", false);
        BenhNhan benhNhan05 = new BenhNhan("David", false);
        Queue<BenhNhan> hangDoi = new PriorityQueue<>();
        hangDoi.add(benhNhan01);
        hangDoi.add(benhNhan02);
        hangDoi.add(benhNhan03);
        hangDoi.add(benhNhan04);
        hangDoi.add(benhNhan05);

        while (!hangDoi.isEmpty()) {
            BenhNhan benhNhan = hangDoi.poll();
            System.out.println(benhNhan);
        }
    }
}
