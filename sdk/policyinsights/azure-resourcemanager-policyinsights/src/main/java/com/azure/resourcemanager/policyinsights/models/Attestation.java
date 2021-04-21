// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.fluent.models.AttestationInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Attestation. */
public interface Attestation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the policyAssignmentId property: The resource ID of the policy assignment that the attestation is setting
     * the state for.
     *
     * @return the policyAssignmentId value.
     */
    String policyAssignmentId();

    /**
     * Gets the policyDefinitionReferenceId property: The policy definition reference ID from a policy set definition
     * that the attestation is setting the state for. If the policy assignment assigns a policy set definition the
     * attestation can choose a definition within the set definition with this property or omit this and set the state
     * for the entire set definition.
     *
     * @return the policyDefinitionReferenceId value.
     */
    String policyDefinitionReferenceId();

    /**
     * Gets the complianceState property: The compliance state that should be set on the resource.
     *
     * @return the complianceState value.
     */
    ComplianceState complianceState();

    /**
     * Gets the expiresOn property: The time the compliance state should expire.
     *
     * @return the expiresOn value.
     */
    OffsetDateTime expiresOn();

    /**
     * Gets the owner property: The person responsible for setting the state of the resource. This value is typically an
     * Azure Active Directory object ID.
     *
     * @return the owner value.
     */
    String owner();

    /**
     * Gets the comments property: Comments describing why this attestation was created.
     *
     * @return the comments value.
     */
    String comments();

    /**
     * Gets the evidence property: The evidence supporting the compliance state set in this attestation.
     *
     * @return the evidence value.
     */
    List<AttestationEvidence> evidence();

    /**
     * Gets the provisioningState property: The status of the attestation.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the lastComplianceStateChangeAt property: The time the compliance state was last changed in this
     * attestation.
     *
     * @return the lastComplianceStateChangeAt value.
     */
    OffsetDateTime lastComplianceStateChangeAt();

    /**
     * Gets the inner com.azure.resourcemanager.policyinsights.fluent.models.AttestationInner object.
     *
     * @return the inner object.
     */
    AttestationInner innerModel();

    /** The entirety of the Attestation definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithPolicyAssignmentId,
            DefinitionStages.WithCreate {
    }
    /** The Attestation definition stages. */
    interface DefinitionStages {
        /** The first stage of the Attestation definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the Attestation definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithPolicyAssignmentId withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Attestation definition allowing to specify policyAssignmentId. */
        interface WithPolicyAssignmentId {
            /**
             * Specifies the policyAssignmentId property: The resource ID of the policy assignment that the attestation
             * is setting the state for..
             *
             * @param policyAssignmentId The resource ID of the policy assignment that the attestation is setting the
             *     state for.
             * @return the next definition stage.
             */
            WithCreate withPolicyAssignmentId(String policyAssignmentId);
        }
        /**
         * The stage of the Attestation definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPolicyDefinitionReferenceId,
                DefinitionStages.WithComplianceState,
                DefinitionStages.WithExpiresOn,
                DefinitionStages.WithOwner,
                DefinitionStages.WithComments,
                DefinitionStages.WithEvidence {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Attestation create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Attestation create(Context context);
        }
        /** The stage of the Attestation definition allowing to specify policyDefinitionReferenceId. */
        interface WithPolicyDefinitionReferenceId {
            /**
             * Specifies the policyDefinitionReferenceId property: The policy definition reference ID from a policy set
             * definition that the attestation is setting the state for. If the policy assignment assigns a policy set
             * definition the attestation can choose a definition within the set definition with this property or omit
             * this and set the state for the entire set definition..
             *
             * @param policyDefinitionReferenceId The policy definition reference ID from a policy set definition that
             *     the attestation is setting the state for. If the policy assignment assigns a policy set definition
             *     the attestation can choose a definition within the set definition with this property or omit this and
             *     set the state for the entire set definition.
             * @return the next definition stage.
             */
            WithCreate withPolicyDefinitionReferenceId(String policyDefinitionReferenceId);
        }
        /** The stage of the Attestation definition allowing to specify complianceState. */
        interface WithComplianceState {
            /**
             * Specifies the complianceState property: The compliance state that should be set on the resource..
             *
             * @param complianceState The compliance state that should be set on the resource.
             * @return the next definition stage.
             */
            WithCreate withComplianceState(ComplianceState complianceState);
        }
        /** The stage of the Attestation definition allowing to specify expiresOn. */
        interface WithExpiresOn {
            /**
             * Specifies the expiresOn property: The time the compliance state should expire..
             *
             * @param expiresOn The time the compliance state should expire.
             * @return the next definition stage.
             */
            WithCreate withExpiresOn(OffsetDateTime expiresOn);
        }
        /** The stage of the Attestation definition allowing to specify owner. */
        interface WithOwner {
            /**
             * Specifies the owner property: The person responsible for setting the state of the resource. This value is
             * typically an Azure Active Directory object ID..
             *
             * @param owner The person responsible for setting the state of the resource. This value is typically an
             *     Azure Active Directory object ID.
             * @return the next definition stage.
             */
            WithCreate withOwner(String owner);
        }
        /** The stage of the Attestation definition allowing to specify comments. */
        interface WithComments {
            /**
             * Specifies the comments property: Comments describing why this attestation was created..
             *
             * @param comments Comments describing why this attestation was created.
             * @return the next definition stage.
             */
            WithCreate withComments(String comments);
        }
        /** The stage of the Attestation definition allowing to specify evidence. */
        interface WithEvidence {
            /**
             * Specifies the evidence property: The evidence supporting the compliance state set in this attestation..
             *
             * @param evidence The evidence supporting the compliance state set in this attestation.
             * @return the next definition stage.
             */
            WithCreate withEvidence(List<AttestationEvidence> evidence);
        }
    }
    /**
     * Begins update for the Attestation resource.
     *
     * @return the stage of resource update.
     */
    Attestation.Update update();

    /** The template for Attestation update. */
    interface Update
        extends UpdateStages.WithPolicyAssignmentId,
            UpdateStages.WithPolicyDefinitionReferenceId,
            UpdateStages.WithComplianceState,
            UpdateStages.WithExpiresOn,
            UpdateStages.WithOwner,
            UpdateStages.WithComments,
            UpdateStages.WithEvidence {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Attestation apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Attestation apply(Context context);
    }
    /** The Attestation update stages. */
    interface UpdateStages {
        /** The stage of the Attestation update allowing to specify policyAssignmentId. */
        interface WithPolicyAssignmentId {
            /**
             * Specifies the policyAssignmentId property: The resource ID of the policy assignment that the attestation
             * is setting the state for..
             *
             * @param policyAssignmentId The resource ID of the policy assignment that the attestation is setting the
             *     state for.
             * @return the next definition stage.
             */
            Update withPolicyAssignmentId(String policyAssignmentId);
        }
        /** The stage of the Attestation update allowing to specify policyDefinitionReferenceId. */
        interface WithPolicyDefinitionReferenceId {
            /**
             * Specifies the policyDefinitionReferenceId property: The policy definition reference ID from a policy set
             * definition that the attestation is setting the state for. If the policy assignment assigns a policy set
             * definition the attestation can choose a definition within the set definition with this property or omit
             * this and set the state for the entire set definition..
             *
             * @param policyDefinitionReferenceId The policy definition reference ID from a policy set definition that
             *     the attestation is setting the state for. If the policy assignment assigns a policy set definition
             *     the attestation can choose a definition within the set definition with this property or omit this and
             *     set the state for the entire set definition.
             * @return the next definition stage.
             */
            Update withPolicyDefinitionReferenceId(String policyDefinitionReferenceId);
        }
        /** The stage of the Attestation update allowing to specify complianceState. */
        interface WithComplianceState {
            /**
             * Specifies the complianceState property: The compliance state that should be set on the resource..
             *
             * @param complianceState The compliance state that should be set on the resource.
             * @return the next definition stage.
             */
            Update withComplianceState(ComplianceState complianceState);
        }
        /** The stage of the Attestation update allowing to specify expiresOn. */
        interface WithExpiresOn {
            /**
             * Specifies the expiresOn property: The time the compliance state should expire..
             *
             * @param expiresOn The time the compliance state should expire.
             * @return the next definition stage.
             */
            Update withExpiresOn(OffsetDateTime expiresOn);
        }
        /** The stage of the Attestation update allowing to specify owner. */
        interface WithOwner {
            /**
             * Specifies the owner property: The person responsible for setting the state of the resource. This value is
             * typically an Azure Active Directory object ID..
             *
             * @param owner The person responsible for setting the state of the resource. This value is typically an
             *     Azure Active Directory object ID.
             * @return the next definition stage.
             */
            Update withOwner(String owner);
        }
        /** The stage of the Attestation update allowing to specify comments. */
        interface WithComments {
            /**
             * Specifies the comments property: Comments describing why this attestation was created..
             *
             * @param comments Comments describing why this attestation was created.
             * @return the next definition stage.
             */
            Update withComments(String comments);
        }
        /** The stage of the Attestation update allowing to specify evidence. */
        interface WithEvidence {
            /**
             * Specifies the evidence property: The evidence supporting the compliance state set in this attestation..
             *
             * @param evidence The evidence supporting the compliance state set in this attestation.
             * @return the next definition stage.
             */
            Update withEvidence(List<AttestationEvidence> evidence);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Attestation refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Attestation refresh(Context context);
}