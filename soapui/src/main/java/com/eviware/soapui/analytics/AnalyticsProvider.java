package com.eviware.soapui.analytics;

import java.util.Map;

/**
 * Created by aleshin on 5/15/2014.
 */
public interface AnalyticsProvider {

    public boolean trackAction(ActionDescription actionDescription);

    public final static class ActionDescription {
        private final String sessionId;
        private final AnalyticsManager.Category category;
        private final String actionDescription;
        private Map<String, String> params;

        ActionDescription(String sessionId, AnalyticsManager.Category category, String actionDescription, Map<String, String> params) {
            this.sessionId = sessionId;
            this.category = category;
            this.actionDescription = actionDescription;
            this.params = params;
        }

        public Map<String, String> getParams() {
            return params;
        }

        public String getSessionId() {
            return sessionId;
        }

        public AnalyticsManager.Category getCategory() {
            return this.category;
        }

        public String getActionTypeDescription() {
            return category.toString();
        }

        public String getActionDescription() {
            return actionDescription;
        }
    }
}