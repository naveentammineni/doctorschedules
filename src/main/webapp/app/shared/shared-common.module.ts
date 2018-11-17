import { NgModule } from '@angular/core';

import { DoctorsSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [DoctorsSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [DoctorsSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class DoctorsSharedCommonModule {}
