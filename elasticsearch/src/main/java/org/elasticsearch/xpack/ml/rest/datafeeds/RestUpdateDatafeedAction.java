/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.ml.rest.datafeeds;

import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.action.RestToXContentListener;
import org.elasticsearch.xpack.ml.MlPlugin;
import org.elasticsearch.xpack.ml.action.UpdateDatafeedAction;
import org.elasticsearch.xpack.ml.datafeed.DatafeedConfig;

import java.io.IOException;

public class RestUpdateDatafeedAction extends BaseRestHandler {

    public RestUpdateDatafeedAction(Settings settings, RestController controller) {
        super(settings);
        controller.registerHandler(RestRequest.Method.POST, MlPlugin.BASE_PATH + "datafeeds/{"
                + DatafeedConfig.ID.getPreferredName() + "}/_update", this);
    }

    @Override
    protected RestChannelConsumer prepareRequest(RestRequest restRequest, NodeClient client) throws IOException {
        String datafeedId = restRequest.param(DatafeedConfig.ID.getPreferredName());
        XContentParser parser = restRequest.contentParser();
        UpdateDatafeedAction.Request updateDatafeedRequest = UpdateDatafeedAction.Request.parseRequest(datafeedId, parser);
        return channel -> client.execute(UpdateDatafeedAction.INSTANCE, updateDatafeedRequest, new RestToXContentListener<>(channel));
    }

}
