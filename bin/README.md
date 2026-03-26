1. **Abstraction**
Abstraksi digunakan untuk menyembunyikan kerumitan
```java
abstract class Movie
```
Dalam program ini, Movie menggambarkan konsep umum dari sebuah film. Semua jenis film seperti film aksi, komedi, horor, dan sebagainya memiliki karakteristik dasar yang sama, misalnya memiliki judul, genre, dan durasi.
```java
abstract void playMovie();
```
Tujuan dari program ini adalah untuk menentukan bahwa setiap class turunan dari Movie harus memiliki method playMovie, tetapi implementasinya dapat berbeda-beda tergantung jenis filmnya.

2. **Encapsulation**
Enkapsulasi bertujuan untuk melindungi data agar tidak bisa diubah sembarangan dari luar class.
```java
public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }
    public int getDuration() {
        return duration;
    }
```
Untuk memungkinkan data tersebut tetap dapat diakses atau dimodifikasi, digunakan method setDuration() sebagai setter dan getDuration() sebagai getter. Method setDuration() berfungsi untuk mengubah nilai durasi film dengan syarat tertentu, yaitu durasi harus lebih besar dari nol.

Sedangkan method getDuration() digunakan untuk mengambil nilai durasi dari luar class tanpa harus mengakses variabel secara langsung.

3. **Inheritance**
Pewarisan memungkinkan sebuah class menggunakan kembali kode (atribut dan method) dari class lain agar kita tidak perlu mengetik ulang kode yang sama.
```java
class ActionMovie extends Movie {

    public ActionMovie(String title, String genre) {
        super(title, genre);
    }
```
Pada contoh di atas, class ActionMovie menggunakan kata kunci extends Movie, yang berarti class tersebut merupakan turunan dari class Movie. Dengan demikian ActionMovie secara otomatis mewarisi semua atribut dan method yang terdapat pada class Movie, seperti title, genre, displayInfo().
Di dalam constructor ActionMovie, digunakan perintah super(title, genre) untuk memanggil constructor dari parent class yaitu Movie. Hal ini dilakukan agar nilai title dan genre dapat langsung diinisialisasi melalui constructor parent class.

4. **Polymorphism**
Polimorfisme memungkinkan satu nama method atau tipe data memiliki perilaku atau bentuk yang berbeda-beda.
```java
 @Override
    void playMovie() {
        System.out.println("Action movie is palying now");
    }
 @Override
    public void playMovie() {
        System.out.println("Comedy movie playing");
    }
```
@Override void playMovie(): Ini merupakan Method Overriding. Meskipun nama method-nya sama-sama playMovie tetapi ActionMovie mencetak "Action movie is palying now", sedangkan ComedyMovie mencetak "Comedy movie playing".

```java
public class Latihan{
     public static void main(String[] args) {

        Movie movie1 = new ActionMovie("Avengers", "Action");
        Movie movie2 = new ComedyMovie("Mr.Bean", "Comedy");

        movie1.playMovie();
        movie2.playMovie();
    }
}
```
Dalam kode tersebut, variabel movie1 dan movie2 dideklarasikan menggunakan tipe Movie, tetapi objek yang sebenarnya dibuat adalah ActionMovie dan ComedyMovie. Ini menunjukkan bahwa satu tipe referensi dapat digunakan untuk merepresentasikan berbagai objek turunan dari class tersebut.

Ketika method playMovie() dipanggil, Java akan menjalankan method yang sesuai dengan tipe objek sebenarnya. Jika objeknya adalah ActionMovie, maka method playMovie() dari class ActionMovie yang dijalankan. Jika objeknya ComedyMovie, maka method dari class ComedyMovie yang akan dijalankan.