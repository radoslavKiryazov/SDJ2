package view.thermometer;

import core.ViewHandler;

public class ThermometerController {
        private ViewHandler viewHandler;

        public void innit(ViewHandler viewHandler){
                this.viewHandler = viewHandler;

        }


        public void onBackButton() {
                viewHandler.openRadiatorView();
        }
}
