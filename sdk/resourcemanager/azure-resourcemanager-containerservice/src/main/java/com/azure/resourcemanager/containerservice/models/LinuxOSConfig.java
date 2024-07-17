// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OS configurations of Linux agent nodes.
 * 
 * See [AKS custom node configuration](https://docs.microsoft.com/azure/aks/custom-node-configuration) for more details.
 */
@Fluent
public final class LinuxOSConfig {
    /*
     * Sysctl settings for Linux agent nodes.
     */
    @JsonProperty(value = "sysctls")
    private SysctlConfig sysctls;

    /*
     * Valid values are 'always', 'madvise', and 'never'. The default is 'always'. For more information see [Transparent
     * Hugepages](https://www.kernel.org/doc/html/latest/admin-guide/mm/transhuge.html#admin-guide-transhuge).
     */
    @JsonProperty(value = "transparentHugePageEnabled")
    private String transparentHugePageEnabled;

    /*
     * Valid values are 'always', 'defer', 'defer+madvise', 'madvise' and 'never'. The default is 'madvise'. For more
     * information see [Transparent
     * Hugepages](https://www.kernel.org/doc/html/latest/admin-guide/mm/transhuge.html#admin-guide-transhuge).
     */
    @JsonProperty(value = "transparentHugePageDefrag")
    private String transparentHugePageDefrag;

    /*
     * The size in MB of a swap file that will be created on each node.
     */
    @JsonProperty(value = "swapFileSizeMB")
    private Integer swapFileSizeMB;

    /**
     * Creates an instance of LinuxOSConfig class.
     */
    public LinuxOSConfig() {
    }

    /**
     * Get the sysctls property: Sysctl settings for Linux agent nodes.
     * 
     * @return the sysctls value.
     */
    public SysctlConfig sysctls() {
        return this.sysctls;
    }

    /**
     * Set the sysctls property: Sysctl settings for Linux agent nodes.
     * 
     * @param sysctls the sysctls value to set.
     * @return the LinuxOSConfig object itself.
     */
    public LinuxOSConfig withSysctls(SysctlConfig sysctls) {
        this.sysctls = sysctls;
        return this;
    }

    /**
     * Get the transparentHugePageEnabled property: Valid values are 'always', 'madvise', and 'never'. The default is
     * 'always'. For more information see [Transparent
     * Hugepages](https://www.kernel.org/doc/html/latest/admin-guide/mm/transhuge.html#admin-guide-transhuge).
     * 
     * @return the transparentHugePageEnabled value.
     */
    public String transparentHugePageEnabled() {
        return this.transparentHugePageEnabled;
    }

    /**
     * Set the transparentHugePageEnabled property: Valid values are 'always', 'madvise', and 'never'. The default is
     * 'always'. For more information see [Transparent
     * Hugepages](https://www.kernel.org/doc/html/latest/admin-guide/mm/transhuge.html#admin-guide-transhuge).
     * 
     * @param transparentHugePageEnabled the transparentHugePageEnabled value to set.
     * @return the LinuxOSConfig object itself.
     */
    public LinuxOSConfig withTransparentHugePageEnabled(String transparentHugePageEnabled) {
        this.transparentHugePageEnabled = transparentHugePageEnabled;
        return this;
    }

    /**
     * Get the transparentHugePageDefrag property: Valid values are 'always', 'defer', 'defer+madvise', 'madvise' and
     * 'never'. The default is 'madvise'. For more information see [Transparent
     * Hugepages](https://www.kernel.org/doc/html/latest/admin-guide/mm/transhuge.html#admin-guide-transhuge).
     * 
     * @return the transparentHugePageDefrag value.
     */
    public String transparentHugePageDefrag() {
        return this.transparentHugePageDefrag;
    }

    /**
     * Set the transparentHugePageDefrag property: Valid values are 'always', 'defer', 'defer+madvise', 'madvise' and
     * 'never'. The default is 'madvise'. For more information see [Transparent
     * Hugepages](https://www.kernel.org/doc/html/latest/admin-guide/mm/transhuge.html#admin-guide-transhuge).
     * 
     * @param transparentHugePageDefrag the transparentHugePageDefrag value to set.
     * @return the LinuxOSConfig object itself.
     */
    public LinuxOSConfig withTransparentHugePageDefrag(String transparentHugePageDefrag) {
        this.transparentHugePageDefrag = transparentHugePageDefrag;
        return this;
    }

    /**
     * Get the swapFileSizeMB property: The size in MB of a swap file that will be created on each node.
     * 
     * @return the swapFileSizeMB value.
     */
    public Integer swapFileSizeMB() {
        return this.swapFileSizeMB;
    }

    /**
     * Set the swapFileSizeMB property: The size in MB of a swap file that will be created on each node.
     * 
     * @param swapFileSizeMB the swapFileSizeMB value to set.
     * @return the LinuxOSConfig object itself.
     */
    public LinuxOSConfig withSwapFileSizeMB(Integer swapFileSizeMB) {
        this.swapFileSizeMB = swapFileSizeMB;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sysctls() != null) {
            sysctls().validate();
        }
    }
}
