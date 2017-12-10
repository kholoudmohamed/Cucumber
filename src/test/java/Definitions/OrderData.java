package Definitions;

public class OrderData {
    public String clearingAgent, accountType, receivedBy, discrete, solicited, orderReceivedTimeHr, orderReceivedTimeMin, newAccountName, newAccountNumber,newAccountState;

    public OrderData(String _clearingAgent, String _accountType, String _receivedBy, String _discrete, String _solicited, String _orderReceivedTimeHr, String _orderReceivedTimeMin, String _newAccountName, String _newAccountNumber, String _newAccountState) {
        clearingAgent = _clearingAgent;
        accountType = _accountType;
        receivedBy = _receivedBy;
        discrete = _discrete;
        solicited = _solicited;
        orderReceivedTimeHr = _orderReceivedTimeHr;
        orderReceivedTimeMin = _orderReceivedTimeMin;
        newAccountName = _newAccountName;
        newAccountNumber = _newAccountNumber;
        newAccountState = _newAccountState;
    }

}
