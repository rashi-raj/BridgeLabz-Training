package com.day1.tabhistorymanager;

import java.util.Stack;

class Browser {

    Tab activeTab = new Tab();
    Stack<Tab> closedTabs = new Stack<>();

    // Close current tab
    void closeTab() {
        if (activeTab.current != null) {
            closedTabs.push(activeTab);
            activeTab = new Tab();
            System.out.println("Tab closed.");
        } else {
            System.out.println("No active tab to close.");
        }
    }

    // Reopen last closed tab
    void reopenTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab reopened.");
            activeTab.show();
        } else {
            System.out.println("No closed tabs.");
        }
    }
}
