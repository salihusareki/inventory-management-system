// 10906595 SALIHU SAREKI SULEMANA
package com.example.netmart;

import com.example.netmart.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
