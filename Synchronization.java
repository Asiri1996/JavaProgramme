class Insitute {
    aynchronized public void classRoom(final String facultyName) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " class taking by " + facultyName);
            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    Insitute ins;
    String facultyName;

    @Override
    public void run() {
        ins.classRoom(facultyName);
    }

    MyThread(final Insitute ins, final String facultyName) {
        this.ins = ins;
        this.facultyName = facultyName;
    }
}

class Synchronization {

    public static void main(final String[] args) {
        final Insitute ins = new Insitute();
        final MyThread m1 = new MyThread(ins, "Asiri");
        final MyThread m2 = new MyThread(ins, "Senith");
        m1.start();
        m2.start();
    }

}