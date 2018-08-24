import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

import { AppRoutingModule } from './app-routing.module';

import { CustomNgMaterialModule } from './common/custom-ng-material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { MaterialDesignFrameworkModule } from 'angular6-json-schema-form';


import { AppComponent } from './app.component';
import { WorkspaceComponent } from './workspace/component/workspace.component';
import { NavigationComponent } from './workspace/component/navigation/navigation.component';
import { OperatorPanelComponent } from './workspace/component/operator-panel/operator-panel.component';
import { PropertyEditorComponent } from './workspace/component/property-editor/property-editor.component';
import { WorkflowEditorComponent } from './workspace/component/workflow-editor/workflow-editor.component';
import { ResultPanelComponent, NgbModalComponent } from './workspace/component/result-panel/result-panel.component';
import { OperatorLabelComponent } from './workspace/component/operator-panel/operator-label/operator-label.component';

import { DashboardComponent } from './dashboard/component/dashboard.component';
import { TopBarComponent } from './dashboard/component/top-bar/top-bar.component';
import { UserAccountIconComponent } from './dashboard/component/top-bar/user-account-icon/user-account-icon.component';
import { FeatureBarComponent } from './dashboard/component/feature-bar/feature-bar.component';
import { FeatureContainerComponent } from './dashboard/component/feature-container/feature-container.component';
import { SavedProjectSectionComponent,
  NgbdModalAddProjectComponent,
  NgbdModalDeleteProjectComponent} from './dashboard/component/feature-container/saved-project-section/saved-project-section.component';
import { RunningJobSectionComponent } from './dashboard/component/feature-container/running-job-section/running-job-section.component';
import { UserDictionarySectionComponent,
  NgbdModalResourceViewComponent,
  NgbdModalResourceAddComponent,
  NgbdModalResourceDeleteComponent
  } from './dashboard/component/feature-container/user-dictionary-section/user-dictionary-section.component';
import { ResourceSectionComponent } from './dashboard/component/feature-container/resource-section/resource-section.component';


@NgModule({
  declarations: [
    AppComponent,
    WorkspaceComponent,
    NavigationComponent,
    OperatorPanelComponent,
    PropertyEditorComponent,
    WorkflowEditorComponent,
    ResultPanelComponent,
    OperatorLabelComponent,

    DashboardComponent,
    TopBarComponent,
    UserAccountIconComponent,
    FeatureBarComponent,
    FeatureContainerComponent,

    SavedProjectSectionComponent,
    NgbdModalAddProjectComponent,
    NgbdModalDeleteProjectComponent,

    RunningJobSectionComponent,
    UserDictionarySectionComponent,
    NgbdModalResourceViewComponent,
    NgbdModalResourceAddComponent,
    NgbdModalResourceDeleteComponent,

    ResourceSectionComponent,

    NgbModalComponent,
    OperatorLabelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule,

    CustomNgMaterialModule,
    BrowserAnimationsModule,
    NgbModule.forRoot(),

    MaterialDesignFrameworkModule

  ],
  entryComponents: [
    NgbdModalAddProjectComponent,
    NgbdModalDeleteProjectComponent,
    NgbdModalResourceViewComponent,
    NgbdModalResourceAddComponent,
    NgbdModalResourceDeleteComponent,
    NgbModalComponent
  ],
  providers: [ HttpClientModule ],
  bootstrap: [AppComponent],
  // dynamically created component must be placed in the entryComponents attribute
})
export class AppModule { }
