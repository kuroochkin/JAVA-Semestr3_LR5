import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Component extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        /**begin of graphic 1*/
        //field of graphic 1
        Rectangle2D graph1 = new Rectangle2D.Double(10, 10, 620, 620);
        //main lines
        Line2D lineTime1 = new Line2D.Double(60, 30, 60, 600);
        Line2D lineCount1 = new Line2D.Double(60, 600, 600, 600);
        //arrow for Time and Count
        Line2D arrowTime1left = new Line2D.Double(60, 30, 50, 40);
        Line2D arrowTime1right = new Line2D.Double(60, 30, 70, 40);
        Line2D arrowCount1left = new Line2D.Double(600, 600, 590, 590);
        Line2D arrowCount1right = new Line2D.Double(600, 600, 590, 610);
        //main points at line Time and Count
        Line2D time1000 = new Line2D.Double(55, 600 - 57, 65, 600 - 57);
        Line2D time2000 = new Line2D.Double(55, 600 - 57 * 2, 65, 600 - 57 * 2);
        Line2D time3000 = new Line2D.Double(55, 600 - 57 * 3, 65, 600 - 57 * 3);
        Line2D time4000 = new Line2D.Double(55, 600 - 57 * 4, 65, 600 - 57 * 4);
        Line2D time5000 = new Line2D.Double(55, 600 - 57 * 5, 65, 600 - 57 * 5);
        Line2D time6000 = new Line2D.Double(55, 600 - 57 * 6, 65, 600 - 57 * 6);
        Line2D time7000 = new Line2D.Double(55, 600 - 57 * 7, 65, 600 - 57 * 7);
        Line2D _time = new Line2D.Double(55, 600 - 57 * 8, 65, 600 - 57 * 8);
        Line2D time13000 = new Line2D.Double(55, 600 - 57 * 8.8, 65, 600 - 57 * 8.8);
        Line2D time650000 = new Line2D.Double(55, 600 - 57 * 9.5, 65, 600 - 57 * 9.5);
        Line2D point10 = new Line2D.Double(60 + 54, 595, 60 + 54, 605);
        Line2D point100 = new Line2D.Double(60 + 54 * 3, 595, 60 + 54 * 3, 605);
        Line2D point1000 = new Line2D.Double(60 + 54 * 5, 595, 60 + 54 * 5, 605);
        Line2D point10000 = new Line2D.Double(60 + 54 * 7, 595, 60 + 54 * 7, 605);
        Line2D point100000 = new Line2D.Double(60 + 54 * 9, 595, 60 + 54 * 9, 605);
        //Array Add Median time points and graphic
        Ellipse2D ArrAddMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 76.5, 4, 4);    //1790
        Ellipse2D ArrAddMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 31.5, 4, 4);      //1160
        Ellipse2D ArrAddMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 17, 4, 4);   //687
        Ellipse2D ArrAddMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 9, 4, 4);  //291
        Ellipse2D ArrAddMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 5.25, 4, 4);//84
        Line2D ArrAddMed10to100 = new Line2D.Double(60 + 54, 600 - 76.5, 60 + 54 * 3, 600 - 31.5);
        Line2D ArrAddMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 31.5, 60 + 54 * 5, 600 - 17);
        Line2D ArrAddMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 17, 60 + 54 * 7, 600 - 9);
        Line2D ArrAddMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 9, 60 + 54 * 9, 600 - 5.25);
        //Linked Add Median time points and graphic
        Ellipse2D LinkAddMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 137, 4, 4);       //1160
        Ellipse2D LinkAddMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 12.3, 4, 4);  //637
        Ellipse2D LinkAddMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 8.7, 4, 4);   //490
        Ellipse2D LinkAddMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 4.75, 4, 4);  //194
        Ellipse2D LinkAddMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 7.5, 4, 4);//51
        Line2D LinkAddMed10to100 = new Line2D.Double(60 + 54, 600 - 137, 60 + 54 * 3, 600 - 12.3);
        Line2D LinkAddMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 12.3, 60 + 54 * 5, 600 - 8.7);
        Line2D LinkAddMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 8.7, 60 + 54 * 7, 600 - 4.75);
        Line2D LinkAddMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 4.75, 60 + 54 * 9, 600 - 7.5);
        //Array Remove Median time points and graphic
        Ellipse2D ArrRemMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 22, 4, 4);         //73700
        Ellipse2D ArrRemMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 20.25, 4, 4);        //9150
        Ellipse2D ArrRemMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 102, 4, 4);  //6222
        Ellipse2D ArrRemMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 140, 4, 4);    //2005
        Ellipse2D ArrRemMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 114.5, 4, 4);//4446
        Line2D ArrRemMed10to100 = new Line2D.Double(60 + 54, 600 - 22, 60 + 54 * 3, 600 - 20.25);
        Line2D ArrRemMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 20.25, 60 + 54 * 5, 600 - 102);
        Line2D ArrRemMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 102, 60 + 54 * 7, 600 - 140);
        Line2D ArrRemMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 140, 60 + 54 * 9, 600 - 114.5);
        //Linked Remove Median time points and graphic
        Ellipse2D LinkRemMedian10 = new Ellipse2D.Double(60 + 54 - 2, 600 - 40.5, 4, 4);        //18100
        Ellipse2D LinkRemMedian100 = new Ellipse2D.Double(60 + 54 * 3 - 2, 600 - 9.5, 4, 4);   //127000
        Ellipse2D LinkRemMedian1000 = new Ellipse2D.Double(60 + 54 * 5 - 2, 600 - 81, 4, 4);    //7150
        Ellipse2D LinkRemMedian10000 = new Ellipse2D.Double(60 + 54 * 7 - 2, 600 - 490, 4, 4);   //780
        Ellipse2D LinkRemMedian100000 = new Ellipse2D.Double(60 + 54 * 9 - 2, 600 - 540, 4, 4); //4941
        Line2D LinkRemMed10to100 = new Line2D.Double(60 + 54, 600 - 40.5, 60 + 54 * 3, 600 - 9.5);
        Line2D LinkRemMed100to1000 = new Line2D.Double(60 + 54 * 3, 600 - 9.5, 60 + 54 * 5, 600 - 81);
        Line2D LinkRemMed1000to10000 = new Line2D.Double(60 + 54 * 5, 600 - 81, 60 + 54 * 7, 600 - 490);
        Line2D LinkRemMed10000to100000 = new Line2D.Double(60 + 54 * 7, 600 - 490, 60 + 54 * 9, 600 - 540);
        //drawing all components
        g2.draw(graph1);
        g2.draw(lineTime1);
        g2.drawString("Time", 30, 30);
        g2.draw(lineCount1);
        g2.drawString("Count", 590, 620);
        g2.draw(arrowTime1left);
        g2.draw(arrowTime1right);
        g2.draw(arrowCount1left);
        g2.draw(arrowCount1right);
        g2.draw(point10);
        g2.draw(point100);
        g2.draw(point1000);
        g2.draw(point10000);
        g2.draw(point100000);
        g2.drawString("10", 60 + 54 - 10, 605 + 15);
        g2.drawString("100", 60 + 54 * 3 - 10, 605 + 15);
        g2.drawString("1000", 60 + 54 * 5 - 10, 605 + 15);
        g2.drawString("10000", 60 + 54 * 7 - 10, 605 + 15);
        g2.drawString("100000", 60 + 54 * 9 - 10, 605 + 15);
        g2.draw(time1000);
        g2.draw(time2000);
        g2.draw(time3000);
        g2.draw(time4000);
        g2.draw(time5000);
        g2.draw(time6000);
        g2.draw(time7000);
        g2.draw(_time);
        g2.draw(time13000);
        g2.draw(time650000);
        g2.drawString("1000", 55 - 40, 600 - 57 + 10);
        g2.drawString("2000", 55 - 40, 600 - 57 * 2 + 10);
        g2.drawString("3000", 55 - 40, 600 - 57 * 3 + 10);
        g2.drawString("4000", 55 - 40, 600 - 57 * 4 + 10);
        g2.drawString("5000", 55 - 40, 600 - 57 * 5 + 10);
        g2.drawString("6000", 55 - 40, 600 - 57 * 6 + 10);
        g2.drawString("7000", 55 - 40, 600 - 57 * 7 + 10);
        g2.drawString("----", 55 - 40, 600 - 57 * 8 + 10);
        g2.drawString("13000", 55 - 40, 600 - 57 * 9 + 20);
        g2.drawString("650000", 55 - 40, 600 - 57 * 10 + 30);
        g2.setColor(Color.RED);
        g2.drawString("Время для Array Add Median", 90, 25);
        g2.draw(ArrAddMedian10);
        g2.draw(ArrAddMedian100);
        g2.draw(ArrAddMedian1000);
        g2.draw(ArrAddMedian10000);
        g2.draw(ArrAddMedian100000);
        g2.draw(ArrAddMed10to100);
        g2.draw(ArrAddMed100to1000);
        g2.draw(ArrAddMed1000to10000);
        g2.draw(ArrAddMed10000to100000);
        g2.setColor(Color.BLUE);
        g2.drawString("Время для Linked Add Median", 90, 40);
        g2.draw(LinkAddMedian10);
        g2.draw(LinkAddMedian100);
        g2.draw(LinkAddMedian1000);
        g2.draw(LinkAddMedian10000);
        g2.draw(LinkAddMedian100000);
        g2.draw(LinkAddMed10to100);
        g2.draw(LinkAddMed100to1000);
        g2.draw(LinkAddMed1000to10000);
        g2.draw(LinkAddMed10000to100000);
        g2.setColor(Color.CYAN);
        g2.drawString("Время для Array Remove Median", 90, 55);
        g2.draw(ArrRemMedian10);
        g2.draw(ArrRemMedian100);
        g2.draw(ArrRemMedian1000);
        g2.draw(ArrRemMedian10000);
        g2.draw(ArrRemMedian100000);
        g2.draw(ArrRemMed10to100);
        g2.draw(ArrRemMed100to1000);
        g2.draw(ArrRemMed1000to10000);
        g2.draw(ArrRemMed10000to100000);
        g2.setColor(Color.GRAY);
        g2.drawString("Время для Linked Remove Median", 90, 70);
        g2.draw(LinkRemMedian10);
        g2.draw(LinkRemMedian100);
        g2.draw(LinkRemMedian1000);
        g2.draw(LinkRemMedian10000);
        g2.draw(LinkRemMedian100000);
        g2.draw(LinkRemMed10to100);
        g2.draw(LinkRemMed100to1000);
        g2.draw(LinkRemMed1000to10000);
        g2.draw(LinkRemMed10000to100000);
        /**end of graphic 1*/


        /**begin of graphic 2*/
        //field of graphic 2
        Rectangle2D graph2 = new Rectangle2D.Double(640, 10, 620, 620);
        //main lines
        Line2D lineTime2 = new Line2D.Double(60 + 630, 30, 60 + 630, 600);
        Line2D lineCount2 = new Line2D.Double(60 + 630, 600, 600 + 630, 600);
        //arrow for Time and Count
        Line2D arrowTime2left = new Line2D.Double(60 + 630, 30, 50 + 630, 40);
        Line2D arrowTime2right = new Line2D.Double(60 + 630, 30, 70 + 630, 40);
        Line2D arrowCount2left = new Line2D.Double(600 + 630, 600, 590 + 630, 590);
        Line2D arrowCount2right = new Line2D.Double(600 + 630, 600, 590 + 630, 610);
        //main points at line Time and Count
        for(int i = 0; i < 7; i++)
        {
            Line2D time01m = new Line2D.Double(55 + 630, 600 - 80 * (i+1), 65 + 630, 600 - 80 * (i+1));
            g2.draw(time01m);
        }
//        /
        Line2D point10sec = new Line2D.Double(60 + 54 + 630, 595, 60 + 54 + 630, 605);
        Line2D point100sec = new Line2D.Double(60 + 54 * 3 + 630, 595, 60 + 54 * 3 + 630, 605);
        Line2D point1000sec = new Line2D.Double(60 + 54 * 5 + 630, 595, 60 + 54 * 5 + 630, 605);
        Line2D point10000sec = new Line2D.Double(60 + 54 * 7 + 630, 595, 60 + 54 * 7 + 630, 605);
        Line2D point100000sec = new Line2D.Double(60 + 54 * 9 + 630, 595, 60 + 54 * 9 + 630, 605);
        //Array Add Total time points and graphic
        Ellipse2D ArrAddTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 8, 4, 4);
        Ellipse2D ArrAddTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 40, 4, 4);
        Ellipse2D ArrAddTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 106, 4, 4);
        Ellipse2D ArrAddTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 174, 4, 4);
        Ellipse2D ArrAddTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 241, 4, 4);
        Line2D ArrAddTot10to100 = new Line2D.Double(60 + 54 + 630, 600 - 8, 60 + 54 * 3 + 630, 600 - 40);
        Line2D ArrAddTot100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 40, 60 + 54 * 5 + 630, 600 - 106);
        Line2D ArrAddTot1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 106, 60 + 54 * 7 + 630, 600 - 174);
        Line2D ArrAddTot10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 174, 60 + 54 * 9 + 630, 600 - 241);
        //Linked Add Total time points and graphic
        Ellipse2D LinkAddTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 19, 4, 4);
        Ellipse2D LinkAddTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 19, 4, 4);
        Ellipse2D LinkAddTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 93.5, 4, 4);
        Ellipse2D LinkAddTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 154, 4, 4);
        Ellipse2D LinkAddTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 251.5, 4, 4);
        Line2D LinkAddTotal10to100 = new Line2D.Double(60 + 54 + 630, 600 - 19, 60 + 54 * 3 + 630, 600 - 19);
        Line2D LinkAddTotal100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 19, 60 + 54 * 5 + 630, 600 - 93.5);
        Line2D LinkAddTotal1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 93.5, 60 + 54 * 7 + 630, 600 - 154);
        Line2D LinkAddTotal10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 154, 60 + 54 * 9 + 630, 600 - 251.5);
        //Array Remove Median time points and graphic
        Ellipse2D ArrRemTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 31.2, 4, 4);
        Ellipse2D ArrRemTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 24, 4, 4);
        Ellipse2D ArrRemTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 96, 4, 4);
        Ellipse2D ArrRemTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 261, 4, 4);
        Ellipse2D ArrRemTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 338, 4, 4);
        Line2D ArrRemTotal10to100 = new Line2D.Double(60 + 54 + 630, 600 - 31.2, 60 + 54 * 3 + 630, 600 - 24);
        Line2D ArrRemTotal100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 24, 60 + 54 * 5 + 630, 600 - 96);
        Line2D ArrRemTotal1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 96, 60 + 54 * 7 + 630, 600 - 261);
        Line2D ArrRemTotal10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 261, 60 + 54 * 9 + 630, 600 - 338);
        //Linked Remove Median time points and graphic
        Ellipse2D LinkRemTotal10 = new Ellipse2D.Double(60 + 54 - 2 + 630, 600 - 5.6, 4, 4);
        Ellipse2D LinkRemTotal100 = new Ellipse2D.Double(60 + 54 * 3 - 2 + 630, 600 - 12.8, 4, 4);
        Ellipse2D LinkRemTotal1000 = new Ellipse2D.Double(60 + 54 * 5 - 2 + 630, 600 - 172, 4, 4);
        Ellipse2D LinkRemTotal10000 = new Ellipse2D.Double(60 + 54 * 7 - 2 + 630, 600 - 331, 4, 4);
        Ellipse2D LinkRemTotal100000 = new Ellipse2D.Double(60 + 54 * 9 - 2 + 630, 600 - 493, 4, 4);
        Line2D LinkRemTotal10to100 = new Line2D.Double(60 + 54 + 630, 600 - 5.6, 60 + 54 * 3 + 630, 600 - 12.8);
        Line2D LinkRemTotal100to1000 = new Line2D.Double(60 + 54 * 3 + 630, 600 - 12.8, 60 + 54 * 5 + 630, 600 - 172);
        Line2D LinkRemTotal1000to10000 = new Line2D.Double(60 + 54 * 5 + 630, 600 - 172, 60 + 54 * 7 + 630, 600 - 331);
        Line2D LinkRemTotal10000to100000 = new Line2D.Double(60 + 54 * 7 + 630, 600 - 331, 60 + 54 * 9 + 630, 600 - 493);
        //drawing all components
        g2.setColor(Color.BLACK);
        g2.draw(graph2);
        g2.draw(lineTime2);
        g2.drawString("Time", 30 + 630, 30);
        g2.draw(lineCount2);
        g2.drawString("Count", 590 + 630, 620);
        g2.draw(arrowTime2left);
        g2.draw(arrowTime2right);
        g2.draw(arrowCount2left);
        g2.draw(arrowCount2right);
//        g2.draw(time01m);
//        g2.draw(time1m);
//        g2.draw(time10m);
//        g2.draw(time100m);
//        g2.draw(time1000m);
//        g2.draw(time10000m);
//        g2.draw(time20000m);
        g2.draw(point10sec);
        g2.draw(point100sec);
        g2.draw(point1000sec);
        g2.draw(point10000sec);
        g2.draw(point100000sec);
        g2.drawString("10", 60 + 54 - 10 + 630, 605 + 15);
        g2.drawString("100", 60 + 54 * 3 - 10 + 630, 605 + 15);
        g2.drawString("1000", 60 + 54 * 5 - 10 + 630, 605 + 15);
        g2.drawString("10000", 60 + 54 * 7 - 10 + 630, 605 + 15);
        g2.drawString("100000", 60 + 54 * 9 - 10 + 630, 605 + 15);
        g2.drawString("0.1m", 55 - 40 + 630, 600 - 80);
        g2.drawString("1m", 55 - 40 + 630, 600 - 80 * 2);
        g2.drawString("10m", 55 - 40 + 630, 600 - 80 * 3);
        g2.drawString("100m", 55 - 40 + 630, 600 - 80 * 4);
        g2.drawString("1000m", 55 - 40 + 630, 600 - 80 * 5);
        g2.drawString("10000m", 55 - 40 + 630, 600 - 80 * 6);
        g2.drawString("20000m", 55 - 40 + 630, 600 - 80 * 7);
        g2.setColor(Color.RED);
        g2.drawString("Время Array Add Total ", 430 + 290, 25);
        g2.draw(ArrAddTotal10);
        g2.draw(ArrAddTotal100);
        g2.draw(ArrAddTotal1000);
        g2.draw(ArrAddTotal10000);
        g2.draw(ArrAddTotal100000);
        g2.draw(ArrAddTot10to100);
        g2.draw(ArrAddTot100to1000);
        g2.draw(ArrAddTot1000to10000);
        g2.draw(ArrAddTot10000to100000);
        g2.setColor(Color.BLUE);
        g2.drawString("Время для Linked Add Total", 430 + 290, 40);
        g2.draw(LinkAddTotal10);
        g2.draw(LinkAddTotal100);
        g2.draw(LinkAddTotal1000);
        g2.draw(LinkAddTotal10000);
        g2.draw(LinkAddTotal100000);
        g2.draw(LinkAddTotal10to100);
        g2.draw(LinkAddTotal100to1000);
        g2.draw(LinkAddTotal1000to10000);
        g2.draw(LinkAddTotal10000to100000);
        g2.setColor(Color.CYAN);
        g2.drawString("Время для Array Remove Total", 430 + 290, 55);
        g2.draw(ArrRemTotal10);
        g2.draw(ArrRemTotal100);
        g2.draw(ArrRemTotal1000);
        g2.draw(ArrRemTotal10000);
        g2.draw(ArrRemTotal100000);
        g2.draw(ArrRemTotal10to100);
        g2.draw(ArrRemTotal100to1000);
        g2.draw(ArrRemTotal1000to10000);
        g2.draw(ArrRemTotal10000to100000);
        g2.setColor(Color.GRAY);
        g2.drawString("Время для Linked Remove Total", 430 + 290, 70);
        g2.draw(LinkRemTotal10);
        g2.draw(LinkRemTotal100);
        g2.draw(LinkRemTotal1000);
        g2.draw(LinkRemTotal10000);
        g2.draw(LinkRemTotal100000);
        g2.draw(LinkRemTotal10to100);
        g2.draw(LinkRemTotal100to1000);
        g2.draw(LinkRemTotal1000to10000);
        g2.draw(LinkRemTotal10000to100000);
    }
}