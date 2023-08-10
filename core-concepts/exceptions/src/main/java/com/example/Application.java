package com.example;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}


//----------------------------------------------------------------
//Money Transfer Module
//----------------------------------------------------------------
// Author : Nag
class MoneyTransfer {
    public boolean transferMoney(double amount, String source, String destination) /*throws AccountNotFoundException, InsufficientBalanceException ,Exception*/{
        if (source.equals("111")) {
            throw new AccountNotFoundException(source);
        }
        double sourceAccountBalance = 10000;
        if (amount > sourceAccountBalance) {
            //System.out.println("Insufficient Funds");
            //return false;
            throw new InsufficientBalanceException(Double.toString(sourceAccountBalance));
        }
        // step-2 : initiate transfer
//
//        if (true) {
//            throw new Exception("Unknown Exception");
//        }
        return true;
    }
}


//----------------------------------------------------------------
//Ticket Booking Module
//----------------------------------------------------------------
// Author : Nag
class TicketBooking {
    MoneyTransfer moneyTransfer = new MoneyTransfer();

    public void bookTicket(double amount) {

        try {
            boolean isSuccess = moneyTransfer.transferMoney(amount, "333", "222");
            // java-appln connected with external-sources ( e.g database
            System.out.println("Ticket Booked Successfully");
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient Balance, balance: " + e.getMessage());
            System.out.println("Ticket Booked Failed");
        } catch (AccountNotFoundException e) {
            System.out.println("Account Not Found, account: " + e.getMessage());
            System.out.println("Ticket Booked Failed");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ticket Booked Failed");
        }finally {
            //
            // release/close any connection with external sources
        }

    }
}


public class Application {
    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.bookTicket(5000);

    }
}
