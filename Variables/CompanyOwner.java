class CompanyOwner {
    public static String getCompany(String companyName) {
        if (companyName == "Reliance") {
            return "Mukesh Ambani";
        } else if (companyName == "Tata") {
            return "Ratan Tata";
        } else if (companyName == "Infosys") {
            return "Narayan Murthy";
        } else if (companyName == "Wipro") {
            return "Azim Premji";
        } else if (companyName == "Adani") {
            return "Gautam Adani";
        } else if (companyName == "HDFC") {
            return "Deepak Parekh";
        } else if (companyName == "ICICI") {
            return "Chanda Kochhar";
        } else if (companyName == "Flipkart") {
            return "Sachin Bansal";
        } else if (companyName == "Zomato") {
            return "Deepinder Goyal";
        } else if (companyName == "Paytm") {
            return "Vijay Shekhar Sharma";
        } else if (companyName == "Byju's") {
            return "Byju Raveendran";
        } else if (companyName == "Ola") {
            return "Bhavish Aggarwal";
        } else {
            return "Not Found";
        }
    }
}
