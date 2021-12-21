package id.ac.upj.tif.uaspbo;

import id.ac.upj.tif.uaspbo.Koneksi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    public TextField jenismakanan;
    public Label labelPesan;
    public Label idaja;
    public Label isiNotif;
    public TextField namamakanan;
    private Koneksi koneksi = new Koneksi();




    @FXML
    private TableView<ModelTable> tabel;
    @FXML
    private TableColumn<ModelTable, String> col_jenis;
    @FXML
    private TableColumn<ModelTable, String> col_nama;

    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();

    // TAMPILKAN TABLE
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showPesan();
    }

    // SELECT DATABASE TABEL
    public ObservableList<ModelTable> getOblist() {
        //QUERY SELECT
        ResultSet rs = null;
        try {
            rs = koneksi.bacaData("SELECT * from makanan");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try
        {
            while (rs.next()){
                oblist.add(new ModelTable(rs.getString("jenis"),rs.getString("nama"),rs.getString("id")));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return oblist;
    }

    // VARIABLE TAMPIL PESAN
    public void showPesan(){
        oblist.clear();
        ObservableList<ModelTable> list = getOblist();

        col_jenis.setCellValueFactory(new PropertyValueFactory<ModelTable, String>("jenis"));
        col_nama.setCellValueFactory(new PropertyValueFactory<ModelTable, String>("nama"));
        tabel.setItems(list);
    }
    public void buttonsimpan(ActionEvent actionEvent) {
        String jenismakananText = jenismakanan.getText();
        String namamakananText = namamakanan.getText();



        if(!jenismakananText.isEmpty()){
            String query = "INSERT INTO makanan (jenis, nama) VALUES('"+ jenismakananText+"', '"+ namamakananText +"')";
            int hasil = koneksi.manipulasiData(query);
            if(hasil == 1) {
                System.out.println("Data Berhasil di Input!!");
            }
        }
        showPesan();
    }
    //BUTTON REMOVE
    @FXML
    public void buttonhapus(ActionEvent actionEvent){
        String id = idaja.getText();
        String query = "DELETE FROM makanan WHERE id='" + id + "'";
        int hasil = koneksi.manipulasiData(query);
        if(hasil == 1) {
            System.out.println("Data Berhasil di Hapus!!");
        }

    showPesan();
}
    public void buttontable(MouseEvent event) {
        ModelTable modeltable = tabel.getSelectionModel().getSelectedItem();
        idaja.setText("" + modeltable.getId());
        jenismakanan.setText("" + modeltable.getJenis());
        namamakanan.setText("" + modeltable.getNama());
    }

    public void buttonupdate(ActionEvent actionEvent) {
        String jenismakananText = jenismakanan.getText();
        String namamakananText = namamakanan.getText();
        String idajaText = idaja.getText();



        if(!jenismakananText.isEmpty()){
            String query = "UPDATE makanan SET jenis='"+ jenismakananText +"', nama='"+ namamakananText+ "' WHERE id='" +idajaText+"'";
            int hasil = koneksi.manipulasiData(query);
            if(hasil == 1) {
                System.out.println("Data Berhasil di Input!!");
            }
        }
        showPesan();
    }
    @FXML
    public void buttonlogout(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("Login.fxml");
    }
    }
