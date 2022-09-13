public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int matQuiz, int fizikQuiz, int kimyaQuiz) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (matQuiz >= 0 && matQuiz <= 100) {
            this.mat.quiz = matQuiz;
        }
        if (fizikQuiz >= 0 && fizikQuiz <= 100) {
            this.fizik.quiz = fizikQuiz;
        }
        if (kimyaQuiz >= 0 && kimyaQuiz <= 100) {
            this.kimya.quiz = kimyaQuiz;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.80) + (this.fizik.quiz * 0.20)) + ((this.kimya.note * 0.80) + (this.kimya.quiz * 0.20)) + ((this.mat.note * 0.80) + (this.mat.quiz * 0.20))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("-------------------");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(mat.name + " Notu\t:" + mat.note + " sözlü:" + mat.quiz);
        System.out.println(fizik.name + " Notu\t:" + fizik.note + " sözlü : " + fizik.quiz);
        System.out.println(kimya.name + " Notu\t:" + kimya.note + " sözlü : " + kimya.quiz);
    }
}


