//Muhammad Rifki Pribadi
//5027251087
//Latihan2

abstract class BaseTask {
    public abstract void tampilkanInfo();
}

class Task extends BaseTask {
    private String tugas;
    private boolean selesai;
    private String prioritas;

    public Task(String tugas, String prioritas) {
        this.tugas = tugas;
        this.prioritas = prioritas;
        this.selesai = false;
    }

    public String getTugas() {
        return tugas;
    }

    public boolean isSelesai() {
        return selesai;
    }

    public String getPrioritas() {
        return prioritas;
    }

    public void cek() {
        selesai = true;
    }

    @Override
    public void tampilkanInfo() {
        String status = selesai ? "Done banh" : "Santai dulu ga sih ";
        System.out.println(tugas + " [" + status + "] (Prioritas: " + prioritas + ")");
    }
}

class AdvancedTask extends Task {

    public AdvancedTask(String tugas, String prioritas) {
        super(tugas, prioritas);
    }

    @Override
    public void tampilkanInfo() {
        String status = isSelesai() ? "Donee" : "Deadline masih lama";
        System.out.println(getTugas() +
                " | Status: " + status +
                " | Prioritas: " + getPrioritas());
    }
}

class TodoList {
    private Task[] tasks;
    private int count;

    public TodoList(int daftartugas) {
        tasks = new Task[daftartugas];
        count = 0;
    }

    public void TambahTugas(Task t) {
        if (count < tasks.length) {
            tasks[count] = t;
            count++;
            System.out.println("Tugas ditambahkan: " + t.getTugas());
        } else {
            System.out.println("TUGAS JANGAN DITUMPUK!!");
        }
    }

    public void tugasselesai(int number) {
        int index = number - 1;

        if (index >= 0 && index < count) {
            tasks[index].cek();
            System.out.println("Tugas selesai: " + tasks[index].getTugas());
        } else {
            System.out.println("MASA BELOM ADA YANG SELESAI!!!");
        }
    }

    public void listtugas() {
        System.out.println("Daftar:");
        for (int i = 0; i < count; i++) {
            tasks[i].tampilkanInfo(); 
        }
    }
}

public class Latihan_2 {
    public static void main(String[] args) {
        TodoList list = new TodoList(5);

        list.TambahTugas(new Task("Kerjain kalkulus", "High"));
        list.TambahTugas(new AdvancedTask("Belajar Java", "High")); 
        list.TambahTugas(new Task("Beresin Kamar", "Low"));
        list.TambahTugas(new AdvancedTask("Kerjain Praktikum", "Low"));

        list.listtugas();

        list.tugasselesai(2);

        list.listtugas();
    }
}