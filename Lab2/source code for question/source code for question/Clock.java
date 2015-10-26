import java.awt.Frame;
import java.awt.Label;
import java.awt.BorderLayout;
import java.util.Calendar;
import java.text.DecimalFormat;

public class Clock extends Thread {
  private DecimalFormat tflz, tf;
  private Frame frame;
  private Label label;

  public Clock() {
    frame = new Frame();
    label = new Label();
    frame.add(label,BorderLayout.CENTER);
    frame.setSize(50,50);
    frame.show();
    tf = new DecimalFormat("#0");
    tflz = new DecimalFormat("00");
  }

  public void run() {
    try {
      while (true) {
        Calendar calendar = Calendar.getInstance();
        StringBuffer buf = new StringBuffer();
        buf.append(tf.format(calendar.get(Calendar.HOUR)));
        buf.append(':');
        buf.append(tflz.format(calendar.get(Calendar.MINUTE)));
        buf.append(':');
        buf.append(tflz.format(calendar.get(Calendar.SECOND)));
        label.setText(buf.toString());
        label.repaint();
        Thread.sleep(1000);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static public void main(String[] arg) {
	Clock clock = new Clock();
	clock.run();
  }
}

