// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.fluent.models.ManagedClusterAgentPoolProfileProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Profile for the container service agent pool.
 */
@Fluent
public final class ManagedClusterAgentPoolProfile extends ManagedClusterAgentPoolProfileProperties {
    /*
     * Windows agent pool names must be 6 characters or less.
     */
    private String name;

    /*
     * The current deployment or provisioning state.
     */
    private String provisioningState;

    /*
     * The version of node image
     */
    private String nodeImageVersion;

    /*
     * If orchestratorVersion is a fully specified version <major.minor.patch>, this field will be exactly equal to it.
     * If orchestratorVersion is <major.minor>, this field will contain the full <major.minor.patch> version being used.
     */
    private String currentOrchestratorVersion;

    /**
     * Creates an instance of ManagedClusterAgentPoolProfile class.
     */
    public ManagedClusterAgentPoolProfile() {
    }

    /**
     * Get the name property: Windows agent pool names must be 6 characters or less.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Windows agent pool names must be 6 characters or less.
     * 
     * @param name the name value to set.
     * @return the ManagedClusterAgentPoolProfile object itself.
     */
    public ManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state.
     * 
     * @return the provisioningState value.
     */
    @Override
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the nodeImageVersion property: The version of node image.
     * 
     * @return the nodeImageVersion value.
     */
    @Override
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Get the currentOrchestratorVersion property: If orchestratorVersion is a fully specified version
     * &lt;major.minor.patch&gt;, this field will be exactly equal to it. If orchestratorVersion is &lt;major.minor&gt;,
     * this field will contain the full &lt;major.minor.patch&gt; version being used.
     * 
     * @return the currentOrchestratorVersion value.
     */
    @Override
    public String currentOrchestratorVersion() {
        return this.currentOrchestratorVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withCount(Integer count) {
        super.withCount(count);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withVmSize(String vmSize) {
        super.withVmSize(vmSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withOsDiskSizeGB(Integer osDiskSizeGB) {
        super.withOsDiskSizeGB(osDiskSizeGB);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withOsDiskType(OSDiskType osDiskType) {
        super.withOsDiskType(osDiskType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withKubeletDiskType(KubeletDiskType kubeletDiskType) {
        super.withKubeletDiskType(kubeletDiskType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withWorkloadRuntime(WorkloadRuntime workloadRuntime) {
        super.withWorkloadRuntime(workloadRuntime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withVnetSubnetId(String vnetSubnetId) {
        super.withVnetSubnetId(vnetSubnetId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withPodSubnetId(String podSubnetId) {
        super.withPodSubnetId(podSubnetId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withMaxPods(Integer maxPods) {
        super.withMaxPods(maxPods);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withOsType(OSType osType) {
        super.withOsType(osType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withOsSku(OSSku osSku) {
        super.withOsSku(osSku);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withMaxCount(Integer maxCount) {
        super.withMaxCount(maxCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withMinCount(Integer minCount) {
        super.withMinCount(minCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withEnableAutoScaling(Boolean enableAutoScaling) {
        super.withEnableAutoScaling(enableAutoScaling);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withScaleDownMode(ScaleDownMode scaleDownMode) {
        super.withScaleDownMode(scaleDownMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withType(AgentPoolType type) {
        super.withType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withMode(AgentPoolMode mode) {
        super.withMode(mode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withOrchestratorVersion(String orchestratorVersion) {
        super.withOrchestratorVersion(orchestratorVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withUpgradeSettings(AgentPoolUpgradeSettings upgradeSettings) {
        super.withUpgradeSettings(upgradeSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withPowerState(PowerState powerState) {
        super.withPowerState(powerState);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withAvailabilityZones(List<String> availabilityZones) {
        super.withAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withEnableNodePublicIp(Boolean enableNodePublicIp) {
        super.withEnableNodePublicIp(enableNodePublicIp);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withNodePublicIpPrefixId(String nodePublicIpPrefixId) {
        super.withNodePublicIpPrefixId(nodePublicIpPrefixId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        super.withScaleSetPriority(scaleSetPriority);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        super.withScaleSetEvictionPolicy(scaleSetEvictionPolicy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withSpotMaxPrice(Float spotMaxPrice) {
        super.withSpotMaxPrice(spotMaxPrice);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withNodeLabels(Map<String, String> nodeLabels) {
        super.withNodeLabels(nodeLabels);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withNodeTaints(List<String> nodeTaints) {
        super.withNodeTaints(nodeTaints);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withProximityPlacementGroupId(String proximityPlacementGroupId) {
        super.withProximityPlacementGroupId(proximityPlacementGroupId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withKubeletConfig(KubeletConfig kubeletConfig) {
        super.withKubeletConfig(kubeletConfig);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withLinuxOSConfig(LinuxOSConfig linuxOSConfig) {
        super.withLinuxOSConfig(linuxOSConfig);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withEnableEncryptionAtHost(Boolean enableEncryptionAtHost) {
        super.withEnableEncryptionAtHost(enableEncryptionAtHost);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withEnableUltraSsd(Boolean enableUltraSsd) {
        super.withEnableUltraSsd(enableUltraSsd);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withEnableFips(Boolean enableFips) {
        super.withEnableFips(enableFips);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withGpuInstanceProfile(GpuInstanceProfile gpuInstanceProfile) {
        super.withGpuInstanceProfile(gpuInstanceProfile);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withCreationData(CreationData creationData) {
        super.withCreationData(creationData);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withCapacityReservationGroupId(String capacityReservationGroupId) {
        super.withCapacityReservationGroupId(capacityReservationGroupId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withHostGroupId(String hostGroupId) {
        super.withHostGroupId(hostGroupId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withNetworkProfile(AgentPoolNetworkProfile networkProfile) {
        super.withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withWindowsProfile(AgentPoolWindowsProfile windowsProfile) {
        super.withWindowsProfile(windowsProfile);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ManagedClusterAgentPoolProfile withSecurityProfile(AgentPoolSecurityProfile securityProfile) {
        super.withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model ManagedClusterAgentPoolProfile"));
        }
        if (upgradeSettings() != null) {
            upgradeSettings().validate();
        }
        if (powerState() != null) {
            powerState().validate();
        }
        if (kubeletConfig() != null) {
            kubeletConfig().validate();
        }
        if (linuxOSConfig() != null) {
            linuxOSConfig().validate();
        }
        if (creationData() != null) {
            creationData().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (windowsProfile() != null) {
            windowsProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedClusterAgentPoolProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("count", count());
        jsonWriter.writeStringField("vmSize", vmSize());
        jsonWriter.writeNumberField("osDiskSizeGB", osDiskSizeGB());
        jsonWriter.writeStringField("osDiskType", osDiskType() == null ? null : osDiskType().toString());
        jsonWriter.writeStringField("kubeletDiskType", kubeletDiskType() == null ? null : kubeletDiskType().toString());
        jsonWriter.writeStringField("workloadRuntime", workloadRuntime() == null ? null : workloadRuntime().toString());
        jsonWriter.writeStringField("vnetSubnetID", vnetSubnetId());
        jsonWriter.writeStringField("podSubnetID", podSubnetId());
        jsonWriter.writeNumberField("maxPods", maxPods());
        jsonWriter.writeStringField("osType", osType() == null ? null : osType().toString());
        jsonWriter.writeStringField("osSKU", osSku() == null ? null : osSku().toString());
        jsonWriter.writeNumberField("maxCount", maxCount());
        jsonWriter.writeNumberField("minCount", minCount());
        jsonWriter.writeBooleanField("enableAutoScaling", enableAutoScaling());
        jsonWriter.writeStringField("scaleDownMode", scaleDownMode() == null ? null : scaleDownMode().toString());
        jsonWriter.writeStringField("type", type() == null ? null : type().toString());
        jsonWriter.writeStringField("mode", mode() == null ? null : mode().toString());
        jsonWriter.writeStringField("orchestratorVersion", orchestratorVersion());
        jsonWriter.writeJsonField("upgradeSettings", upgradeSettings());
        jsonWriter.writeJsonField("powerState", powerState());
        jsonWriter.writeArrayField("availabilityZones", availabilityZones(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("enableNodePublicIP", enableNodePublicIp());
        jsonWriter.writeStringField("nodePublicIPPrefixID", nodePublicIpPrefixId());
        jsonWriter.writeStringField("scaleSetPriority",
            scaleSetPriority() == null ? null : scaleSetPriority().toString());
        jsonWriter.writeStringField("scaleSetEvictionPolicy",
            scaleSetEvictionPolicy() == null ? null : scaleSetEvictionPolicy().toString());
        jsonWriter.writeNumberField("spotMaxPrice", spotMaxPrice());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("nodeLabels", nodeLabels(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("nodeTaints", nodeTaints(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("proximityPlacementGroupID", proximityPlacementGroupId());
        jsonWriter.writeJsonField("kubeletConfig", kubeletConfig());
        jsonWriter.writeJsonField("linuxOSConfig", linuxOSConfig());
        jsonWriter.writeBooleanField("enableEncryptionAtHost", enableEncryptionAtHost());
        jsonWriter.writeBooleanField("enableUltraSSD", enableUltraSsd());
        jsonWriter.writeBooleanField("enableFIPS", enableFips());
        jsonWriter.writeStringField("gpuInstanceProfile",
            gpuInstanceProfile() == null ? null : gpuInstanceProfile().toString());
        jsonWriter.writeJsonField("creationData", creationData());
        jsonWriter.writeStringField("capacityReservationGroupID", capacityReservationGroupId());
        jsonWriter.writeStringField("hostGroupID", hostGroupId());
        jsonWriter.writeJsonField("networkProfile", networkProfile());
        jsonWriter.writeJsonField("windowsProfile", windowsProfile());
        jsonWriter.writeJsonField("securityProfile", securityProfile());
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterAgentPoolProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterAgentPoolProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedClusterAgentPoolProfile.
     */
    public static ManagedClusterAgentPoolProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterAgentPoolProfile deserializedManagedClusterAgentPoolProfile
                = new ManagedClusterAgentPoolProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withCount(reader.getNullable(JsonReader::getInt));
                } else if ("vmSize".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withVmSize(reader.getString());
                } else if ("osDiskSizeGB".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withOsDiskSizeGB(reader.getNullable(JsonReader::getInt));
                } else if ("osDiskType".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withOsDiskType(OSDiskType.fromString(reader.getString()));
                } else if ("kubeletDiskType".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withKubeletDiskType(KubeletDiskType.fromString(reader.getString()));
                } else if ("workloadRuntime".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withWorkloadRuntime(WorkloadRuntime.fromString(reader.getString()));
                } else if ("vnetSubnetID".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withVnetSubnetId(reader.getString());
                } else if ("podSubnetID".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withPodSubnetId(reader.getString());
                } else if ("maxPods".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withMaxPods(reader.getNullable(JsonReader::getInt));
                } else if ("osType".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withOsType(OSType.fromString(reader.getString()));
                } else if ("osSKU".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withOsSku(OSSku.fromString(reader.getString()));
                } else if ("maxCount".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withMaxCount(reader.getNullable(JsonReader::getInt));
                } else if ("minCount".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withMinCount(reader.getNullable(JsonReader::getInt));
                } else if ("enableAutoScaling".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withEnableAutoScaling(reader.getNullable(JsonReader::getBoolean));
                } else if ("scaleDownMode".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withScaleDownMode(ScaleDownMode.fromString(reader.getString()));
                } else if ("type".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withType(AgentPoolType.fromString(reader.getString()));
                } else if ("mode".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withMode(AgentPoolMode.fromString(reader.getString()));
                } else if ("orchestratorVersion".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withOrchestratorVersion(reader.getString());
                } else if ("currentOrchestratorVersion".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.currentOrchestratorVersion = reader.getString();
                } else if ("nodeImageVersion".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.nodeImageVersion = reader.getString();
                } else if ("upgradeSettings".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withUpgradeSettings(AgentPoolUpgradeSettings.fromJson(reader));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.provisioningState = reader.getString();
                } else if ("powerState".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withPowerState(PowerState.fromJson(reader));
                } else if ("availabilityZones".equals(fieldName)) {
                    List<String> availabilityZones = reader.readArray(reader1 -> reader1.getString());
                    deserializedManagedClusterAgentPoolProfile.withAvailabilityZones(availabilityZones);
                } else if ("enableNodePublicIP".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withEnableNodePublicIp(reader.getNullable(JsonReader::getBoolean));
                } else if ("nodePublicIPPrefixID".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withNodePublicIpPrefixId(reader.getString());
                } else if ("scaleSetPriority".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withScaleSetPriority(ScaleSetPriority.fromString(reader.getString()));
                } else if ("scaleSetEvictionPolicy".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withScaleSetEvictionPolicy(ScaleSetEvictionPolicy.fromString(reader.getString()));
                } else if ("spotMaxPrice".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withSpotMaxPrice(reader.getNullable(JsonReader::getFloat));
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedClusterAgentPoolProfile.withTags(tags);
                } else if ("nodeLabels".equals(fieldName)) {
                    Map<String, String> nodeLabels = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedClusterAgentPoolProfile.withNodeLabels(nodeLabels);
                } else if ("nodeTaints".equals(fieldName)) {
                    List<String> nodeTaints = reader.readArray(reader1 -> reader1.getString());
                    deserializedManagedClusterAgentPoolProfile.withNodeTaints(nodeTaints);
                } else if ("proximityPlacementGroupID".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withProximityPlacementGroupId(reader.getString());
                } else if ("kubeletConfig".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withKubeletConfig(KubeletConfig.fromJson(reader));
                } else if ("linuxOSConfig".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withLinuxOSConfig(LinuxOSConfig.fromJson(reader));
                } else if ("enableEncryptionAtHost".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withEnableEncryptionAtHost(reader.getNullable(JsonReader::getBoolean));
                } else if ("enableUltraSSD".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withEnableUltraSsd(reader.getNullable(JsonReader::getBoolean));
                } else if ("enableFIPS".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withEnableFips(reader.getNullable(JsonReader::getBoolean));
                } else if ("gpuInstanceProfile".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withGpuInstanceProfile(GpuInstanceProfile.fromString(reader.getString()));
                } else if ("creationData".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withCreationData(CreationData.fromJson(reader));
                } else if ("capacityReservationGroupID".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withCapacityReservationGroupId(reader.getString());
                } else if ("hostGroupID".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.withHostGroupId(reader.getString());
                } else if ("networkProfile".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withNetworkProfile(AgentPoolNetworkProfile.fromJson(reader));
                } else if ("windowsProfile".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withWindowsProfile(AgentPoolWindowsProfile.fromJson(reader));
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile
                        .withSecurityProfile(AgentPoolSecurityProfile.fromJson(reader));
                } else if ("name".equals(fieldName)) {
                    deserializedManagedClusterAgentPoolProfile.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterAgentPoolProfile;
        });
    }
}
