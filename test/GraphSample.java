package test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraphSample extends JFrame
{
    public static void main(String[] args)
    {
        new GraphSample();
    }

    public GraphSample()
    {
        this.setTitle("GraphSample");
        this.setSize(800, 400);
        this.setLayout(new BorderLayout());
        this.add(new JButton("これはボタンです。"), BorderLayout.SOUTH);

        DefaultCategoryDataset data = new DefaultCategoryDataset();

        JFreeChart chart = ChartFactory.createBarChart("AAA",
                                      "BBB",
                                      "CCC",
                                      data,
                                      PlotOrientation.VERTICAL,
                                      true,
                                      false,
                                      false);

        data.addValue(800, "A", "April");
        data.addValue(600, "M", "May");
        data.addValue(900, "J", "June");

        ChartPanel cpanel = new ChartPanel(chart);
        JButton button = new JButton("ボタンです");

        this.add(cpanel, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}
