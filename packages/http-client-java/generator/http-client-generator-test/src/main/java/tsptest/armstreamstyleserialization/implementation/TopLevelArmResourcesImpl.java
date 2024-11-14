// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.armstreamstyleserialization.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import tsptest.armstreamstyleserialization.fluent.TopLevelArmResourcesClient;
import tsptest.armstreamstyleserialization.fluent.models.TopLevelArmResourceInner;
import tsptest.armstreamstyleserialization.models.TopLevelArmResource;
import tsptest.armstreamstyleserialization.models.TopLevelArmResourceTagsUpdate;
import tsptest.armstreamstyleserialization.models.TopLevelArmResources;

public final class TopLevelArmResourcesImpl implements TopLevelArmResources {
    private static final ClientLogger LOGGER = new ClientLogger(TopLevelArmResourcesImpl.class);

    private final TopLevelArmResourcesClient innerClient;

    private final tsptest.armstreamstyleserialization.ArmStreamStyleSerializationManager serviceManager;

    public TopLevelArmResourcesImpl(TopLevelArmResourcesClient innerClient,
        tsptest.armstreamstyleserialization.ArmStreamStyleSerializationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public TopLevelArmResource update(String resourceGroupName, String topLevelArmResourceName,
        TopLevelArmResourceTagsUpdate properties) {
        TopLevelArmResourceInner inner
            = this.serviceClient().update(resourceGroupName, topLevelArmResourceName, properties);
        if (inner != null) {
            return new TopLevelArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TopLevelArmResource update(String resourceGroupName, String topLevelArmResourceName,
        TopLevelArmResourceTagsUpdate properties, Context context) {
        TopLevelArmResourceInner inner
            = this.serviceClient().update(resourceGroupName, topLevelArmResourceName, properties, context);
        if (inner != null) {
            return new TopLevelArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private TopLevelArmResourcesClient serviceClient() {
        return this.innerClient;
    }

    private tsptest.armstreamstyleserialization.ArmStreamStyleSerializationManager manager() {
        return this.serviceManager;
    }
}