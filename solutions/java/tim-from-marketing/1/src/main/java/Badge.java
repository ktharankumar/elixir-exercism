class Badge {
        public static String print(Integer id, String name, String department) {
        String badge = "";
        badge+= (id != null) ? "[" + id + "] - " : "";
        badge+= name + " - ";
        badge+= (department == null) ? "OWNER" : department.toUpperCase();
        return badge;
    }
}
