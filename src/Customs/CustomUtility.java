package Customs;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class CustomUtility {


    public static void alertDialog(String header, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Done");
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }



    public static Boolean confirmationDialog(String header, String content){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, content, ButtonType.YES, ButtonType.NO);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText(header);

        Button yesBtn = (Button) alert.getDialogPane().lookupButton(ButtonType.YES);
        Button noBtn = (Button) alert.getDialogPane().lookupButton(ButtonType.NO);

        yesBtn.addEventHandler(KeyEvent.ANY, (event) -> {
            if(event.getCode() == KeyCode.ENTER) alert.setResult(ButtonType.YES);
        });

        noBtn.addEventHandler(KeyEvent.ANY, (event) -> {
            if(event.getCode() == KeyCode.ENTER) alert.setResult(ButtonType.NO);
        });

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.YES) return true;
        else if (result.get() == ButtonType.NO) return false;
        return false;
    }

    public static void printStackTrace(Exception ee){
        ee.printStackTrace();
    }


    public static Image resizeImage(String filePath, int width, int heigth)throws IOException {
        File inputFile = new File(filePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // creates output image
        BufferedImage outputImage = new BufferedImage(width, heigth, inputImage.getType());

        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, width, heigth, null);
        g2d.dispose();

        return SwingFXUtils.toFXImage(outputImage, null);
    }

    public static Image resizeImageFromImageIcon(ImageIcon icon, int width, int heigth)throws IOException {
        BufferedImage inputImage = imageToBufferedImage(icon.getImage());

        // creates output image
        BufferedImage outputImage = new BufferedImage(width, heigth, inputImage.getType());

        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, width, heigth, null);
        g2d.dispose();

        return SwingFXUtils.toFXImage(outputImage, null);
    }

    public static BufferedImage imageToBufferedImage(java.awt.Image im) {
        BufferedImage bi = new BufferedImage(im.getWidth(null),im.getHeight(null),BufferedImage.TYPE_INT_RGB);
        Graphics bg = bi.getGraphics();
        bg.drawImage(im, 0, 0, null);
        bg.dispose();
        return bi;
    }

    public static Timestamp getTimeStempFormat(String date){
        String pattern = "yyyy-MM-dd hh:mm:ss.SSSSSSSS";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.from(formatter.parse(date));
        System.out.println("date time : "+localDateTime);
        return Timestamp.valueOf(localDateTime);
    }

    public static String dateFormatSql(Object object){
        if(object == null) return "";
        return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:aa").format(object);
    }

    public static String dateFormatUtil(java.util.Date date){
        if(date == null) return "";
        return new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:aa").format(date);
    }

    ///////******* HELP
    public static void help(){
        try {
            FXMLLoader loader = new FXMLLoader(CustomUtility.class.getResource("/FXML/help.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("HELP");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception ee){
            CustomUtility.printStackTrace(ee);
            CustomUtility.alertDialog("Invalid", ee.getMessage());
        }
    }


    public static void setVoucherTypeColor(TableColumn tableColumn) {
        tableColumn.setCellFactory(column -> new TableCell<Object, String>(){
            @Override
            protected void updateItem(String  item, boolean empty) {
                super.updateItem(item, empty);
                if(!empty){
                    setText(Decode.transection_VoucherType(item));
                    if(item.equals(Values.Transection.voucherTypeRegular)) setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if(item.equals(Values.Transection.voucherTypeReturn)) setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if(item.equals(Values.Transection.voucherTypeReceipt)) setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if(item.equals(Values.Transection.voucherTypeSale)) setBackground(new Background(new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if(item.equals(Values.Transection.voucherTypeDeadStock)) setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if(item.equals(Values.Transection.voucherTypeGodownToGodown)) setBackground(new Background(new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if(item.equals(Values.Transection.voucherTypeGodownIn)) setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                else {
                    setText("");
                    setBackground(null);
                }
            }
        });
    }

    public static void setStatusColor(TableColumn tableColumn) {
        tableColumn.setCellFactory(column -> new TableCell<Object, String>(){
            @Override
            protected void updateItem(String  item, boolean empty) {
                super.updateItem(item, empty);
                if(!empty){
                    setText(Decode.transection_Status(item));
                    if (item.equals(Values.Transection.statusClear)) setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    else if (item.equals(Values.Transection.statusPending)) setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                else {
                    setText("");
                    setBackground(null);
                }
            }
        });
    }
}
